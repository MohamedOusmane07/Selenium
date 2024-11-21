package part3_4.com.demoqa.tests.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class LinksTest extends BaseTest {

    @Test
    public void linkTest() {
        var linkPage =homePage.goToElements().goToLinks();
        linkPage.clickBadResquetLink();
        String actualReponse = linkPage.getResponseLink();
        Assert.assertTrue(actualReponse.contains("400") && actualReponse.contains("Bad Request"),
                "\n Actual response ("+ actualReponse +
                        ") \n does not contain '400' and 'Bad Request' \n");
    }
}
