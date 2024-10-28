package com.swag.co.steps.productInformation;

import com.swag.co.pages.productInformation.ProductInformationPage;
import net.thucydides.core.annotations.Step;

public class ProductInformationStep extends ProductInformationPage {

    @Step("Ingresar usuario")
    public void typeUsername(String username){

        txt_username.sendKeys(username);

    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){

        txt_password.sendKeys(password);

    }

    @Step("Click en el boton login")
    public void clickLogin(){

        btn_login.click();

    }

    @Step("Click en la imagen del producto")
    public void clickProductImage(){
        img_product.click();
    }






}
