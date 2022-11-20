package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver parluks;

    private By pageTitle = By.className("title");

    private By checkoutButton = By.id("checkout");

    public WebElement getCheckoutButton(){
        return parluks.findElement(checkoutButton);
    }

    public CartPage(WebDriver parluks) {
        this.parluks = parluks;
    }

    public WebElement getPageTitle() {
        return parluks.findElement(pageTitle);
    }
}
