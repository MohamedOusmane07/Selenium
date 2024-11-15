package com.mohamed.demoqa.pages;

import com.mohamed.demoqa.pages.forms.FormsPage;
import com.mohamed.base.BasePage;
import static utilities.JavaScriptUtility.scrollToElementJS;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms'] ");


    public FormsPage goToForms(){
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}
