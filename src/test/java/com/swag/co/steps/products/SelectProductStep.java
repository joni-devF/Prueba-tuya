package com.swag.co.steps.products;

import com.swag.co.pages.products.SelectProductPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class SelectProductStep extends SelectProductPage {

    @Step("Agregar productos al carro de compras")
    public void addProducts(int quantity){
        for (int i=0; i<quantity; i++){
            Actions act = new Actions(getDriver());
            act.click(products.get(i)).perform();
        }
    }

    @Step("Click en boton carro de compras")
    public void  clickShoppingCar(){
        shoppingCar.click();
    }
}
