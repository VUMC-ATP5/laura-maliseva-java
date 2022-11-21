package lekcijaDevini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearch extends BaseTest {

    @Test
    public void testSearchFunctionality(){
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct("apelsīni");

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        List<WebElement> searchResultList = searchResultsPage.getSearchResultList();
        Assert.assertEquals(searchResultList.size(), 6);

        mainPage.searchProduct("āboli");
        searchResultList = searchResultsPage.getSearchResultList();

        for (WebElement webElement : searchResultList) {
            System.out.println(webElement.getText());
        }
        Assert.assertEquals(searchResultList.size(), 27);
    }

    @Test
    public void testRegistrationWindowClosesCorrectly(){
        MainPage mainPage = new MainPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("b-mui-carousel--placeholder")));
        mainPage.clickSignInButton();

        SingInModal singInModal = new SingInModal(driver);
        singInModal.waitForSingInModalToApper();
        singInModal.closeButtonClick();
        singInModal.waitForSingInModalToDisapper();

        Assert.assertEquals(singInModal.getModalWindow().size(), 0);
    }

}
