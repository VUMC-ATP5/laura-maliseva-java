package lekcijaSeptini.majasDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SouceDemoOtraisScenarijs extends BaseTest {

    @Test
    public void testChekoutMessage() throws InterruptedException {
        WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
        lietotajVardsIevadesLauks.sendKeys("standard_user");

        WebElement lietotajParolesIevadesLauks = parluks.findElement(By.id("password"));
        lietotajParolesIevadesLauks.sendKeys("secret_sauce");

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement clickCart = parluks.findElement(By.id("shopping_cart_container"));
        clickCart.click();

        WebElement checkout = parluks.findElement(By.id("checkout"));
        checkout.click();

        WebElement ContinuePoga = parluks.findElement(By.id("continue"));
        ContinuePoga.click();

        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container.error"));
        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText, "Error: First Name is required");

        WebElement VardaIevadesLauks = parluks.findElement(By.id("first-name"));
        VardaIevadesLauks.sendKeys("Vārds");
        ContinuePoga.click();

        WebElement errorTextFieldLastName = parluks.findElement(By.cssSelector("div.error-message-container.error"));
        String errorTextLastName = errorTextFieldLastName.getText();
        Assert.assertEquals(errorTextLastName, "Error: Last Name is required");

        WebElement UzvardaIevadesLauks = parluks.findElement(By.id("last-name"));
        UzvardaIevadesLauks.sendKeys("Uzvārds");
        ContinuePoga.click();

        WebElement errorTextFieldZipCode = parluks.findElement(By.cssSelector("div.error-message-container.error"));
        String errorTextZipCode = errorTextFieldZipCode.getText();
        Assert.assertEquals(errorTextZipCode, "Error: Postal Code is required");

        WebElement PastaIndeksaIevadesLauks = parluks.findElement(By.id("postal-code"));
        PastaIndeksaIevadesLauks.sendKeys("LV1811");

        Thread.sleep(5000);
    }
}
