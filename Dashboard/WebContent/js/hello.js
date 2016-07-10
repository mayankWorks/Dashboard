var myapp = angular.module('dashboard',[]);
	
myapp.controller('graphOneController',function Hello1($scope, $http) {
    $http.get('http://localhost:8080/Dashboard/rest/resources/graphone').
        success(function(data) {
            $scope.graph = data;
        });
})


myapp.controller('graphTwoController',function Hello1($scope, $http) {
    $http.get('http://localhost:8080/Dashboard/rest/resources/testapi').
        success(function(data) {
            $scope.graph = data;
        });
})

myapp.controller('graphOneListController',function Hello1($scope, $http) {
    $http.get('http://localhost:8080/Dashboard/rest/resources/graphonelist').
        success(function(data) {
            $scope.graphlist = data;
        });
})