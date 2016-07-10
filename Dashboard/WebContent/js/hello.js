function Hello($scope, $http) {
    $http.get('http://localhost:8080/Dashboard/rest/resources/graphone').
        success(function(data) {
            $scope.greeting = data;
        });
}