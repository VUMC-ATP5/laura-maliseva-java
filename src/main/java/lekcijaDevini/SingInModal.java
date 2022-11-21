package lekcijaDevini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SingInModal {
    WebDriver driver;
    WebDriverWait wait;

    public SingInModal(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By modalWindow = By.cssSelector("div.b-login-modal");

    By closeButton = By.cssSelector("div.b-login-modal button.close");

    public List<WebElement> getModalWindow(){
        return driver.findElements(modalWindow);
    }

    public void closeButtonClick(){
        driver.findElement(closeButton).click();
    }

    public void waitForSingInModalToApper(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalWindow));
    }

    public void waitForSingInModalToDisapper(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(modalWindow));
    }


}
