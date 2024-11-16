package part3_4.com.demoqa.tests.part3.forms;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static org.testng.AssertJUnit.assertTrue;

public class RadioButtonTest extends BaseTest {


    @Test
    public void testRadioButton() {
        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickFemaleRadioButton();
        assertTrue(practiceFormPage.isFemaleRadioButtonSelected());
        practiceFormPage.clickMaleRadioButton();
        assertTrue(practiceFormPage.isMaleRadioButtonSelected());
    }

}
