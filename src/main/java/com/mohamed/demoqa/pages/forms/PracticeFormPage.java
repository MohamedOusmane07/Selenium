package com.mohamed.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class PracticeFormPage extends FormsPage {

    private By femaleRadioButton = By.id("gender-radio-2");
    private By maleRadioButton = By.id("gender-radio-1");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");


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


    public void clickSportsHobbyCheckbox() {
        if (!find(sportsHobbyCheckbox).isSelected()) {
            scrollToElementJS(sportsHobbyCheckbox);
            clickElementJS(sportsHobbyCheckbox);
        }
    }

    public void clickReadingHobbyCheckbox() {
        if (!find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickElementJS(readingHobbyCheckbox);
        }
    }


    public void clickMusicHobbyCheckbox() {
        if (!find(musicHobbyCheckbox).isSelected()) {
            scrollToElementJS(musicHobbyCheckbox);
            clickElementJS(musicHobbyCheckbox);
        }
    }


    public void unclickReadingHobbyCheckbox() {
        if (find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickElementJS(readingHobbyCheckbox);
        }
    }


    public boolean isReadingHobbyCheckboxSelected() {
        return find(readingHobbyCheckbox).isSelected();
    }
















































}
