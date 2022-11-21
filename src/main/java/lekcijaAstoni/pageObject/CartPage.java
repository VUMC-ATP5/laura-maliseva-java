package lekcijaAstoni.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    private By checkoutButton = By.id("checkout");

    public WebElement getCheckoutButton(){
        return parluks.findElement(checkoutButton);
    }

    public CartPage(WebDriver parluks) {
        super(parluks);
    }

}
