package lekcijaAstoni.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {

    private By pageTitle = By.cssSelector("span.title");

    private By cartButton = By.id("shopping_cart_container");

    public WebElement getCartButton(){
        return parluks.findElement(cartButton);
    }

    public ProductPage(WebDriver parluks) {
        super(parluks);
    }

    public WebElement getPageTitle() {
        return parluks.findElement(pageTitle);
    }
}
