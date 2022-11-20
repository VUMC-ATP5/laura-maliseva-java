package lekcijaAstoni;

import lekcijaAstoni.pageObject.CartPage;
import lekcijaAstoni.pageObject.CheckoutPage;
import lekcijaAstoni.pageObject.LoginPage;
import lekcijaAstoni.pageObject.ProductPage;
import lekcijaSeptini.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarijsDivi extends BaseTest {

    @Test
    public void testChechoutPageMandatoryFields() throws InterruptedException {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("standard_user", "secret_sauce");
        ProductPage productPage = new ProductPage(parluks);
        productPage.getCartButton().click();
        CartPage cartPage = new CartPage(parluks);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
        cartPage.getCheckoutButton().click();
        CheckoutPage checkoutPage = new CheckoutPage(parluks);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(), "CHECKOUT: YOUR INFORMATION");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorText(),"Error: First Name is required");
        checkoutPage.inputFirstName("Vārds");
        Assert.assertEquals(checkoutPage.getPageTitle().getText(), "Error: Last Name is required");
        checkoutPage.clickContinueButton();


        Thread.sleep(5000);
    }


}
