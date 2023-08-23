package lekcijaSeptini.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    public WebDriver parluks;

    WebDriverWait wait;

    @BeforeMethod
    public void setupBrowser() throws MalformedURLException {
//        parluks = new ChromeDriver();

        FirefoxOptions browserOptions = new FirefoxOptions();
        browserOptions.setPlatformName("macOS 12");
        browserOptions.setBrowserVersion("102");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "<your build id>");
        sauceOptions.put("name", "<your test name>");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://oauth-lgrivina-8ef6f:337ee90c-830b-4347-b99a-f6e356dbbd6b@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        parluks = new RemoteWebDriver(url, browserOptions);

        parluks.manage().window().maximize();
        wait = new WebDriverWait(parluks, Duration.ofSeconds(10));
        parluks.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        parluks.navigate().to("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDownBrowser() {
        parluks.quit();
    }
}
