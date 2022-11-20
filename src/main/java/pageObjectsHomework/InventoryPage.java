package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

    WebDriver parluks;

    private By pageTitle = By.cssSelector("span.title");

    private By cartButton = By.id("shopping_cart_container");

    private By addToCartBackpackButton = By.id("add-to-cart-sauce-labs-backpack");


    public WebElement getAddToCartBackpackButton() {
        return parluks.findElement(addToCartBackpackButton);
    }

    public WebElement getCartButton(){
        return parluks.findElement(cartButton);
    }

    public InventoryPage(WebDriver parluks) {
        this.parluks = parluks;
    }

    public WebElement getPageTitle() {
        return parluks.findElement(pageTitle);
    }

}
