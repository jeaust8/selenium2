package selenium;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestShopScenario {

    protected WebDriver driver;

    @Before
    public void beforeScenario(){
        driver = DriverFactory.createDriver(Browser.Chrome);

        driver.get("https://vgp-shop.polteq-testing.com/");

        driver.manage().window().maximize();
    }

//    @After
//    public void afterScenario(){
//        driver.quit();
//    }
}
