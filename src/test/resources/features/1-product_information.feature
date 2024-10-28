@Suite @SelectProduct
Feature: CP01 - Seleccionar un producto para ver su informacion

  Background: Validar el ingreso de sesion con credenciales validas

    Given el usuario navega al sitio web

    Scenario: Validar ingreso exitos
      When ingrea con credenciales validas
      And la aplicacion muestra el modulo principal
      And de click a al imagen del producto
      Then debo ver la informacion del producto
