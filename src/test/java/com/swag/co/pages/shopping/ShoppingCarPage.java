package com.swag.co.pages.shopping;

import io.cucumber.java.zh_cn.假如;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShoppingCarPage extends PageObject {

    @FindBy(xpath = "//a[@class='btn_action checkout_button']")
    protected WebElementFacade checkoutButton;

    @FindBy(id = "first-name")
    protected WebElementFacade txt_firstName;

    @FindBy(id = "last-name")
    protected WebElementFacade txt_lastName;

    @FindBy(id = "postal-code")
    protected WebElementFacade txt_postal;

    @FindBy(xpath = "//input[@class='btn_primary cart_button']")
    protected WebElementFacade continueButton;

    @FindBy(xpath = "//a[@class='btn_action cart_button']")
    protected WebElementFacade finishButton;



}
