function getNextEvent($http, baseURL, daterId, f){
	var event;
	$http.get(baseURL + "/events?next_event=true&dater_id=" + daterId).then(function(response){
		var events = response.data.events
		if(events.length != 0) {
			event = events[0];
		}
		f(event);
	});
	return event;
}

function setEvent($scope, $http, $window){
	return function(){
		var eventId = $window.sessionStorage.getItem("event_id");
		if(angular.isUndefined(eventId)){
			setNextEvent($http, $scope.erosBaseUrl, $scope.daterId, function(event){
				if(angular.isDefined(event)) {
					$window.sessionStorage.setItem("event_id", event.getId());
					$scope.disableContinueButton = false
				} else {
					$scope.disableContinueButton = true
				}
			});
		}
	}
}

function getImages($http, baseURL, daterId, fn) {
	$http.get(baseURL + "/daters/" + daterId + "/images/").then(function(response){
		var images = response.data.images;
		fn(images)
	});
}

function getImageSrcs(images) {
	var imgSrcs = []
	for (var i = 0; i < images.length; i++) {
		imgSrc = "http://69.164.208.35:8001/imgs/" + images[i].name;
		imgSrcs.push({src : imgSrc, id:i});
	}
	if(imgSrcs.length == 0) {
		imgSrcs.push({src:"../imgs/blank.jpg", id:0})
	}
	return imgSrcs;
}

function updateImages($http, $scope){
	getImages($http, $scope.erosBaseUrl, $scope.daterId, function(images){
		$scope.imagesMetadata = images;
		var imgSrcs = getImageSrcs(images)
		$scope.slides.splice(0, $scope.slides.length)
		for(var i = 0; i < imgSrcs.length; i++){
			$scope.slides.push(imgSrcs[i])
		}
		$scope.profileImage = $scope.slides[0].src;
	}); 
}



var app = angular.module("profile", ['ngMaterial', 'ngAnimate', 'ngSanitize', 'ui.bootstrap']); 

app.directive("fileread", [function () {
    return {
        scope: {
            fileread: "=",
            filename: "="
        },
        link: function (scope, element, attributes) {
            element.bind("change", function (changeEvent) {
                scope.$apply(function () {
                    var reader = new FileReader();
                    reader.onload = function (loadEvent) {
                        scope.$apply(function () {
                            scope.fileread = loadEvent.target.result;
                        });
                    }
                    scope.filename = changeEvent.target.files[0].name;
                    reader.readAsDataURL(changeEvent.target.files[0]);
                });
            });
        }
    }
}]);

app.controller("profileController",function($scope, $http, $window, $interval, $mdDialog, $mdToast){
	$scope.erosBaseUrl = 'http://69.164.208.35:17320/eros/v1'
	$scope.daterId = $window.sessionStorage.getItem('dater_id');
	$scope.file = "";
	$scope.active = 0;
	$scope.imgFilename = "";
	$scope.imagesMetadata = []
	$scope.slides = [{src:"../imgs/blank.jpg", id:0}]
	$scope.profileImage = "../imgs/blank.jpg";
	$scope.profileName = "";
	updateImages($http, $scope);
	setEvent($scope, $http, $window).apply();
	$interval(setEvent($scope, $http, $window), 3000);
	$interval(function(){
		if($scope.profileName == ""){
			$http.get($scope.erosBaseUrl + "/daters/" + $scope.daterId).then(function(response){
				var dater = response.data;
				$scope.profileName = dater.profile_name;
			});
		}
	}, 500)
	$interval(function(){
		if($scope.file != ""){
			var aFile = $scope.file;
			$scope.file = ""
			var img = {"content":aFile, "name":$scope.imgFilename};
			$http.post($scope.erosBaseUrl + "/daters/" + $scope.daterId + "/images/", img).then(function(){
				$mdToast.show($mdToast.simple().textContent('Image added.').hideDelay(3000));
				updateImages($http, $scope);
			});
		}
	}, 500);
	$scope.onContinue=function(){
		if(!$scope.disableContinueButton){
	    	$window.location.href="../event_info/event_info.html";
		}
	};

	var removeImage=function(){
		var imageId = $scope.imagesMetadata[$scope.active].id;
		$http.delete($scope.erosBaseUrl + "/daters/" + $scope.daterId + "/images/" + imageId).then(function(response){
			$mdToast.show($mdToast.simple().textContent('Image deleted.').hideDelay(3000));
			updateImages($http, $scope)
		});
	}
	$scope.onRemoveImage=function(){
		var removeImageConfirm = $mdDialog.confirm()
	      .title('Would you like to delete the current image?')
	      .ok('Delete')
	      .cancel('Cancel');
		$mdDialog.show(removeImageConfirm).then(removeImage, angular.noop());
	};
	var inputElem = document.querySelector('#fileInput')
	inputElem.onclick = function () {
	    this.value = null;
	};
	$scope.onAddImage=function(){
		inputElem.click();
	};
})