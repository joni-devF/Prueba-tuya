package com.swag.co.steps.shopping;

import com.swag.co.pages.shopping.ShoppingCarPage;
import net.thucydides.core.annotations.Step;

public class ShoppingCarStep extends ShoppingCarPage {

    @Step("Click en checkout")
    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    @Step("Ingresar nombre")
    public void typeFirstName(String firstname){
        txt_firstName.sendKeys(firstname);
    }

    @Step("Ingresar apellido")
    public void typeLastName(String lastname){
        txt_lastName.sendKeys(lastname);
    }

    @Step("Ingresar codigo postal")
    public void typePostalCode(String postal){
        txt_postal.sendKeys(postal);
    }

    @Step("Click en continuar")
    public void clickContinue(){
        continueButton.click();
    }

    @Step("Click en finalizar")
    public void clickFinish(){
        finishButton.click();
    }

}
