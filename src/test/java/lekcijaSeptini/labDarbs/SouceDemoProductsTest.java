package lekcijaSeptini.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SouceDemoProductsTest extends BaseTest {

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

        Thread.sleep(5000);
    }


}
