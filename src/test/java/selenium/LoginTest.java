package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.pages.HomePage;
import selenium.pages.MyAccountPage;

public class LoginTest extends TestShopScenario {

    @Test
    public void nagivatebackandforward(){

        HomePage homePage = new HomePage(driver);
        homePage.clickMyAccountLink();

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.login("tester@polteq-testing.com", "1!QazXsw2@");

        String loginText = driver.findElement(By.cssSelector("div.woocommerce-MyAccount-content p")).getText();

        Assert.assertTrue(loginText.contains("tester@polteq-testing.com"));

        Boolean logoutDisplayed = driver.findElement(By.cssSelector("li.woocommerce-MyAccount-navigation-link--customer-logout >a")).isDisplayed();

        Assert.assertTrue("Logout not found", logoutDisplayed);
    }
}
