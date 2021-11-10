package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.UUID;


public class RegisterTest extends TestShopScenario{

    @Test
    public void RegisterAccount(){

        driver.findElement(By.cssSelector("li.my-account a")).click();

        driver.findElement(By.id("reg_username")).sendKeys(UUID.randomUUID().toString());
        driver.findElement(By.id("reg_email")).sendKeys((UUID.randomUUID().toString()) + "@gmail.com");
        driver.findElement(By.id("reg_password")).sendKeys((UUID.randomUUID().toString()));
        driver.findElement(By.name("register")).click();

        Boolean logoutDisplayed = driver.findElement(By.cssSelector("li.woocommerce-MyAccount-navigation-link--customer-logout >a")).isDisplayed();

        Assert.assertTrue("Logout not found", logoutDisplayed);

        driver.findElement(By.cssSelector("li.woocommerce-MyAccount-navigation-link--edit-address a")).click();
    }

}
