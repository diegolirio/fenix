/**
 * 
 */
var fenix = angular.module('fenix', ['ngRoute']);  

var SERVER_APP = '/fenix';
  
fenix.config(['$locationProvider', '$routeProvider', function($locationProvider, $routeProvider) {
  	  $locationProvider.hashPrefix('');
	  $routeProvider 
		.when('/', { templateUrl:'./home.html'})     
		.when('/oficina/cadastro',   { templateUrl: 'oficina-cadastro.html' })
		.when('/oficina/:oficinaId', { templateUrl:'./endereco.html'});
}]);