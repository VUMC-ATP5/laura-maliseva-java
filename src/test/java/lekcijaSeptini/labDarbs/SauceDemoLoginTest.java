package lekcijaSeptini.labDarbs;

import lekcijaAstoni.pageObject.LoginPage;
import lekcijaAstoni.pageObject.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class SauceDemoLoginTest extends BaseTest {

//    @Test
//    public void testLoginWrongUsernameAndPasword() throws InterruptedException {
//        WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
//        lietotajVardsIevadesLauks.sendKeys("Silvestra");
//
//        WebElement lietotajParolesIevadesLauks = parluks.findElement(By.id("password"));
//        lietotajParolesIevadesLauks.sendKeys("qwerty123");
//
//        WebElement loginPoga = parluks.findElement(By.id("login-button"));
//        loginPoga.click();
//
//        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));
//
//        String errorText = errorTextField.getText();
//        Assert.assertEquals(errorText,"Epic sadface: Username and password do not match any user in this service");
//    }

//    private void testLogin(String username, String password, String expectedErrorMessage) {
//        WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
//        lietotajVardsIevadesLauks.sendKeys(username);
//
//        WebElement lietotajParolesIevadesLauks = parluks.findElement(By.id("password"));
//        lietotajParolesIevadesLauks.sendKeys(password);
//
//        WebElement loginPoga = parluks.findElement(By.id("login-button"));
//        loginPoga.click();
//
//        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));
//
//        String errorText = errorTextField.getText();
//        Assert.assertEquals(errorText,expectedErrorMessage);
//    }
//
//    @Test
//    public void testLoginWrongUsernameAndPasword() {
//        testLogin("dsfsd", "fdgfdgser", "Epic sadface: Username and password do not match any user in this service");
//    }
//
//    @Test
//    public void testLoginEmptyUsernameAndPasword() {
//        testLogin("", "", "Epic sadface: Username is required");
//    }
//
//    @Test
//    public void testLoginEmptyUsernameAndFieldPasword() {
//        testLogin("", "sfvsdtr", "Epic sadface: Username is required");
//    }
//
//    @Test
//    public void testLoginFieldUsernameAndEmptyPasword() {
//        testLogin("asjdnklsaj", "", "Epic sadface: Password is required");
//    }

// Astotās lekcijas tests

    @Test
    public void testLoginPageObjectExample() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("asdasd", "asdasdasda");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any " +
                "user in this service");
    }

    @Test
    public void testLoginWrongUsernameAndPassword() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("asdasd", "asdasdasda");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any " +
                "user in this service");
    }

    @Test
    public void testLoginEmptyUsernameAndPassword() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("", "");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username is required");
    }

    @Test
    public void testLoginEmptyUsernameAndFilledPassword() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("", "asdasdasdas");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username is required");
    }

    @Test
    public void testLoginFilledUsernameAndEmptyPassword() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("asdas", "");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Password is required");
    }

    @Test
    public void testSuccessfulLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("standard_user", "secret_sauce");
        ProductPage productPage = new ProductPage(parluks);
        wait.until(ExpectedConditions.visibilityOf(productPage.getPageTitle()));
        Assert.assertEquals(productPage.getPageTitle().getText(), "PRODUCTS");

        System.out.println(parluks.getTitle());

        productPage.getLinkedInButton().click();

        ArrayList<String> tabs = new ArrayList<> (parluks.getWindowHandles());
        parluks.switchTo().window(tabs.get(1));
        System.out.println(parluks.getTitle());
        parluks.close();

        parluks.switchTo().window(tabs.get(0));

        ((JavascriptExecutor) parluks).executeScript("arguments[0].scrollIntoView(true);", productPage.getLinkedInButton());



        Thread.sleep(5000);
    }

    @Test
    public void actionTest() throws InterruptedException {
        parluks.navigate().to("https://www.w3schools.com/howto/howto_css_dropdown.asp");

        parluks.findElement(By.id("accept-choices")).click();

        Actions actions = new Actions(parluks);
        WebElement element = parluks.findElement(By.cssSelector("div.dropdown2"));
        actions.moveToElement(element).build().perform();

        parluks.findElement(By.cssSelector("div.dropdown2 a")).click();

        Thread.sleep(5000);
    }



}
