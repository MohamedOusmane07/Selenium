package com.mohamed.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends ElementsPage{


    private By badResquetLinks=By.id("bad-request");
    private By linkResponse=By.id("linkResponse");

    public void clickBadResquetLink(){
        scrollToElementJS(badResquetLinks);
        click(badResquetLinks);
    }

    public String getResponseLink(){
        delay(2000);
        return find(linkResponse).getText();
    }

}























