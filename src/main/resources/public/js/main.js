var app=angular.module("springDemo", []);
app.controller("AppCtrl", function ($scope) {
    $scope.websites=[{
        iconImgUrl:'',
        id:'stackoverflow',
        website:'http://stackoverflow.com',
        title:'StackOverflow website',
        description:'StackOverflow description'
    }];
});