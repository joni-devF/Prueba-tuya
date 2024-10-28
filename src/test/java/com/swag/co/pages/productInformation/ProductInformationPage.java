package com.swag.co.pages.productInformation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductInformationPage extends PageObject {

    // mapeo de elementos del login

    @FindBy(id = "user-name")
    protected WebElementFacade txt_username;

    @FindBy(id = "password")
    protected WebElementFacade txt_password;

    @FindBy(id = "login-button")
    protected WebElementFacade btn_login;

    @FindBy(xpath = "//img[@class='inventory_item_img']")
    protected WebElementFacade img_product;


}
