package seleniumHomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectsHomework.*;

import java.time.Duration;

public class souceDemoTests {

    public WebDriver parluks;

    WebDriverWait wait;

    @BeforeMethod
    public void setupBrowser() {
        parluks = new ChromeDriver();
        parluks.manage().window().maximize();
        wait = new WebDriverWait(parluks, Duration.ofSeconds(10));
        parluks.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        parluks.navigate().to("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDownBrowser() {
        parluks.quit();
    }

    @Test
    public void testOfBuyingProcess() throws InterruptedException {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(parluks);
        Assert.assertEquals(inventoryPage.getPageTitle().getText(), "PRODUCTS");
        inventoryPage.getAddToCartBackpackButton().click();
        Assert.assertEquals(inventoryPage.getCartButton().getText(), "1");
        inventoryPage.getCartButton().click();

        CartPage cartPage = new CartPage(parluks);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
        cartPage.getCheckoutButton().click();

        CheckoutPage checkoutPage = new CheckoutPage(parluks);
        checkoutPage.inputFirstName("Dārta");
        checkoutPage.inputLastNameField("Krūmiņa");
        checkoutPage.inputPostalCodeField("LV-1811");
        checkoutPage.clickContinueButton();

        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(parluks);
        Assert.assertEquals(checkoutOverviewPage.getInventoryItemName().getText(), "Sauce Labs Backpack");
        checkoutOverviewPage.getFinishButton().click();

        ChekoutSuccessPage chekoutSuccessPage = new ChekoutSuccessPage(parluks);
        Assert.assertEquals(chekoutSuccessPage.getPageTitle().getText(), "CHECKOUT: COMPLETE!");
        chekoutSuccessPage.getBackHomeButton().click();
    }

    @Test
    public void testChechoutPageMandatoryFields() throws InterruptedException {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(parluks);
        inventoryPage.getCartButton().click();

        CartPage cartPage = new CartPage(parluks);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
        cartPage.getCheckoutButton().click();

        CheckoutPage checkoutPage = new CheckoutPage(parluks);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(), "CHECKOUT: YOUR INFORMATION");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorText(),"Error: First Name is required");

        checkoutPage.inputFirstName("Dārta");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorText(), "Error: Last Name is required");

        checkoutPage.inputLastNameField("Krūmiņa");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorText(), "Error: Postal Code is required");

        checkoutPage.inputPostalCodeField("LV-1811");
        checkoutPage.clickContinueButton();

    }

}
