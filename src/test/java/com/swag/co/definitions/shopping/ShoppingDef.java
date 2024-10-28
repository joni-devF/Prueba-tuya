package com.swag.co.definitions.shopping;

import com.swag.co.steps.products.SelectProductStep;
import com.swag.co.steps.shopping.ShoppingCarStep;
import com.swag.co.steps.validations.ValidationsStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ShoppingDef {

    @Steps(shared = true)
    SelectProductStep selectProduct;

    @Steps(shared = true)
    ValidationsStep validate;

    @Steps(shared = true)
    ShoppingCarStep shoppingCar;

    @And("agregar productos al carro de compras")
    public void userAddProducts(){
        selectProduct.addProducts(3);
    }

    @And("da click al icono del carro de compras")
    public void userClickShoppingCar(){
        selectProduct.clickShoppingCar();
    }

    @Then("mostrar productos agregados en el carro de compras")
    public void listProducts(){
        Assert.assertTrue(validate.productsDisplayed());
    }

    @When("completa todo el proceso de compra")
    public void userCompleteOrder(){
        shoppingCar.clickCheckoutButton();
        shoppingCar.typeFirstName("Juan");
        shoppingCar.typeLastName("Perez");
        shoppingCar.typePostalCode("c2523");
        shoppingCar.clickContinue();
        shoppingCar.clickFinish();
    }

    @Then("se debe de finalizar la compra exitosamente")
    public void systemProcessShoppinCar(){
        Assert.assertTrue(validate.orderTextDisplayed());
    }
}
