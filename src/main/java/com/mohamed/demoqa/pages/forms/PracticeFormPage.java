package com.mohamed.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.id("gender-radio-2");
    private By maleRadioButton = By.id("gender-radio-1");


    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickElementJS(femaleRadioButton);
    }

    public void clickMaleRadioButton() {
        scrollToElementJS(maleRadioButton);
        clickElementJS(maleRadioButton);
    }

    public boolean isFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public boolean isMaleRadioButtonSelected() {
        return find(maleRadioButton).isSelected();
    }


























}
