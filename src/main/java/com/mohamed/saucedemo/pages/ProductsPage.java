package com.mohamed.saucedemo.pages;

import com.mohamed.base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    private By productsHeader = By.xpath("//span[text()='Products']");

    public boolean isProductsHeaderDisplayed() {

        return find(productsHeader).isDisplayed();
    }
}
