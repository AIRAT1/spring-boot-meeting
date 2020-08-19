var app=angular.module("springDemo", []);
app.controller("AppCtrl", function ($scope, $http) {
    $scope.websites=[];
    $http.get('http://localhost:8080/api/stackoverflow').success(function(data) {
        $scope.websites=data;
    });
});