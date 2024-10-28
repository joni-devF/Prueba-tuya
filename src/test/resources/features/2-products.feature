@Suite @ShoppingCar
Feature: CP02 - validar carrito de compras

  Background: Realizar 3 validaciones en el carrito de compras
    Given el usuario navega al sitio web
    When ingrea con credenciales validas

    @ShoppingCarList
    Scenario: Agregar productos al carro de compras
      And agregar productos al carro de compras
      And da click al icono del carro de compras
      Then mostrar productos agregados en el carro de compras

    @ShoppingCarProcess
    Scenario: Al realizar una la compra de los productos, se mostrara un mensaje de compra exitos
      And agregar productos al carro de compras
      And da click al icono del carro de compras
      When completa todo el proceso de compra
      Then se debe de finalizar la compra exitosamente