package com.swag.co.definitions.productInformation;

import com.swag.co.steps.productInformation.ProductInformationStep;
import com.swag.co.steps.validations.ValidationsStep;
import com.swag.co.utilities.website.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ProductInformationDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    ProductInformationStep login;

    @Steps(shared = true)
    ValidationsStep validate;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.navigateTo("https://www.saucedemo.com/v1/index.html");
    }

    @When("ingrea con credenciales validas")
    public void userLogin(){
        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.clickLogin();
    }

    @And("la aplicacion muestra el modulo principal")
    public void systemShowProductModule(){
        Assert.assertTrue(validate.titleIsVisible());
    }

    @And("de click a al imagen del producto")
    public void  clickImage(){
        login.clickProductImage();
    }

    @Then("debo ver la informacion del producto")
    public void systemShowProduct(){
        Assert.assertTrue(validate.nameProductDisplayed());
    }

}
