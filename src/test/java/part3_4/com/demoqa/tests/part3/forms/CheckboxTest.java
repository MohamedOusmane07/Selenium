package part3_4.com.demoqa.tests.part3.forms;

import com.mohamed.demoqa.pages.HomePage;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import part3_4.com.demoqa.base.BaseTest;

import static org.testng.Assert.assertFalse;

public class CheckboxTest extends BaseTest {


    @Test
    public void checkboxTest() {

        var practiceFormsPage = homePage.goToForms().clickPracticeForm();
        practiceFormsPage.clickSportsHobbyCheckbox();
        practiceFormsPage.clickReadingHobbyCheckbox();
        practiceFormsPage.clickMusicHobbyCheckbox();
        practiceFormsPage.unclickReadingHobbyCheckbox();
        boolean isReadingHobbyCheckboxSelected = practiceFormsPage.isReadingHobbyCheckboxSelected();
        assertFalse(isReadingHobbyCheckboxSelected);
    }
}
