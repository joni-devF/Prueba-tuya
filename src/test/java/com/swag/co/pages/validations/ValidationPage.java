package com.swag.co.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//div[@class='product_label']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    protected List<WebElementFacade> productsList;

    @FindBy(xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")
    protected WebElementFacade lbl_order;

    @FindBy(xpath = "//div[@class='inventory_details_name']")
    protected WebElementFacade lbl_nameProduct;

}
