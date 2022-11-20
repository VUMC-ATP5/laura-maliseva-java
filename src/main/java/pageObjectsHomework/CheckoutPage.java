package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    WebDriver parluks;

    private By pageTitle = By.className("title");

    private By continueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");

    private By firstNameInputField = By.id("first-name");

    private By lastNameInputField = By.id("last-name");

    private By postalCodeInputField = By.id("postal-code");


    public void inputPostalCodeField(String c){
        parluks.findElement(postalCodeInputField).sendKeys(c);
    }
    public void inputLastNameField(String b){
        parluks.findElement(lastNameInputField).sendKeys(b);
    }

    public void inputFirstName(String a){
        parluks.findElement(firstNameInputField).sendKeys(a);
    }

    public String getErrorText(){
        return parluks.findElement(errorText).getText();
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
