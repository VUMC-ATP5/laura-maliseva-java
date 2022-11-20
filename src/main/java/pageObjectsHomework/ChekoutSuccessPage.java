package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChekoutSuccessPage {

    WebDriver parluks;

    private By pageTitle = By.cssSelector("span.title");

    private By backHomeButton = By.id("back-to-products");

    public WebElement getBackHomeButton(){
        return  parluks.findElement(backHomeButton);
    }

    public WebElement getPageTitle() {
        return parluks.findElement(pageTitle);
    }

    public ChekoutSuccessPage(WebDriver parluks) {
        this.parluks = parluks;
    }
}
