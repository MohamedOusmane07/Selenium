package part3_4.com.demoqa.tests.part3.elements;

import com.mohamed.demoqa.pages.HomePage;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static org.testng.Assert.assertEquals;

public class WebTablesTest extends BaseTest {


    @Test
    public void testWebTables() {
        String email="alden@example.com";
        var webTablePages= homePage.goToElements().clickWebTables();
        webTablePages.clickEdit(email);
        webTablePages.setAge("23");
        webTablePages.clickSubmitButton();
        String actualAge=webTablePages.getTableAge(email);
        assertEquals(actualAge,"23",
                "\n Actual and Expected Ages do not match\n");
    }

}
