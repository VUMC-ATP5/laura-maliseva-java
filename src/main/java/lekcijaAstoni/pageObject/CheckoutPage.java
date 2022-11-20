package lekcijaAstoni.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    WebDriver parluks;

    private By pageTitle = By.className("title");

    private By continueButton = By.id("continue");

    // jāpārbauda Jura kods
    private By errorText = By.ByCssSelector("h3");

    private By firstNameInputField = By.id("first-name");

    public void inputFirstName(String a){
        parluks.findElement(firstNameInputField).sendKeys(a);
    }

    // jāpārbauda Jura kods
    public String getErrorText(){
        return parluks.findElement(errorText);
    }

    public void clickContinueButton(){
        parluks.findElement(continueButton).click();
    }

    public WebElement getPageTitle() {
        return parluks.findElement(pageTitle);
    }

    public CheckoutPage(WebDriver parluks) {
        this.parluks = parluks;
    }
}
