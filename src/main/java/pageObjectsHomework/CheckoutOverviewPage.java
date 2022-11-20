package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {

    WebDriver parluks;

    private By inventoryItemName = By.className("inventory_item_name");

    private By finishButton = By.id("finish");

    public WebElement getFinishButton(){
        return parluks.findElement(finishButton);
    }

    public WebElement getInventoryItemName() {
        return parluks.findElement(inventoryItemName);
    }

    public CheckoutOverviewPage(WebDriver parluks) {
        this.parluks = parluks;
    }
}
