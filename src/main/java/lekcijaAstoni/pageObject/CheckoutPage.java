package lekcijaAstoni.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {

    private By continueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");

    private By firstNameInputField = By.id("first-name");


    public void inputFirstName(String a){
        parluks.findElement(firstNameInputField).sendKeys(a);
    }

    public String getErrorText(){
        return parluks.findElement(errorText).getText();
    }

    public void clickContinueButton(){
        parluks.findElement(continueButton).click();
    }

    public CheckoutPage(WebDriver parluks) {
        super(parluks);
    }
}
