package part2.saucedemo.tests.products;

import org.testng.annotations.Test;
import part2.saucedemo.base.BaseTest;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ProductTests extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed () {
        var productPage=loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productPage.isProductsHeaderDisplayed(),
                "\nProducts Header is not displayed\n");


    }
}
