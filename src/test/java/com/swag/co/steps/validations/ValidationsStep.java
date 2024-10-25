package com.swag.co.steps.validations;

import com.swag.co.pages.validations.ValidationPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ValidationsStep extends ValidationPage {

    @Step("Validar visualizacion del modulo de productos")
    public Boolean titleIsVisible(){
        return lbl_product.isDisplayed();
    }

    @Step("Validar productos listados")
    public Boolean productsDisplayed(){
        for (WebElementFacade product:productsList){
            if (product.isDisplayed()){
                return true;
            }
        }
        return false;
    }

    @Step("Validar finalizacion de orden")
    public Boolean orderTextDisplayed() {
        return lbl_order.isDisplayed();
    }


    public Boolean nameProductDisplayed(){
        return lbl_nameProduct.isDisplayed();
    }
}
