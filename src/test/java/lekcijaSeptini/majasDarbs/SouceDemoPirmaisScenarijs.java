package lekcijaSeptini.majasDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SouceDemoPirmaisScenarijs extends BaseTest {

    @Test
    public void testAddProductToCart() throws InterruptedException {
        WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
        lietotajVardsIevadesLauks.sendKeys("standard_user");

        WebElement lietotajParolesIevadesLauks = parluks.findElement(By.id("password"));
        lietotajParolesIevadesLauks.sendKeys("secret_sauce");

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement productPageTitle = parluks.findElement(By.cssSelector("span.title"));
        String acctualPageTitleText = productPageTitle.getText();
        Assert.assertEquals(acctualPageTitleText, "PRODUCTS");

        WebElement addToCart = parluks.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart.click();

        WebElement clickCart = parluks.findElement(By.id("shopping_cart_container"));
        clickCart.click();

        WebElement productInCart = parluks.findElement(By.id("item_4_title_link"));
        String productPageCartElement = productInCart.getText();
        Assert.assertEquals(productPageCartElement, "Sauce Labs Backpack");

        WebElement checkout = parluks.findElement(By.id("checkout"));
        checkout.click();

        WebElement VardaIevadesLauks = parluks.findElement(By.id("first-name"));
        VardaIevadesLauks.sendKeys("Vārds");

        WebElement UzvardaIevadesLauks = parluks.findElement(By.id("last-name"));
        UzvardaIevadesLauks.sendKeys("Uzvārds");

        WebElement PastaIndeksaIevadesLauks = parluks.findElement(By.id("postal-code"));
        PastaIndeksaIevadesLauks.sendKeys("LV1811");

        WebElement ContinuePoga = parluks.findElement(By.id("continue"));
        ContinuePoga.click();

        WebElement CheckoutOverview = parluks.findElement(By.id("item_4_title_link"));
        String CheckoutProduct = CheckoutOverview.getText();
        Assert.assertEquals(CheckoutProduct, "Sauce Labs Backpack");

        WebElement FinishPoga = parluks.findElement(By.id("finish"));
        FinishPoga.click();

        WebElement CheckoutOverviewComplete = parluks.findElement(By.className("complete-header"));
        String CheckoutComplete = CheckoutOverviewComplete.getText();
        Assert.assertEquals(CheckoutComplete, "THANK YOU FOR YOUR ORDER");

        WebElement BackHome = parluks.findElement(By.id("back-to-products"));
        BackHome.click();

        Thread.sleep(5000);
    }
}
