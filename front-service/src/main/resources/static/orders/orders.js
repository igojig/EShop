angular.module('market-front').controller('ordersController', function ($scope, $http) {
    const contextPath = 'http://host.docker.internal:5555/core/';

    $scope.loadOrders = function () {
        $http.get(contextPath + 'api/v1/orders')
            .then(function (response) {
                $scope.MyOrders = response.data;
            });
    }

    $scope.loadOrders();
});