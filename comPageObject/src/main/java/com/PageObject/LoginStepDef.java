package com.PageObject;

import org.openqa.selenium.By;
import org.junit.Assert;

public class LoginStepDef extends DriverManager {

    Elements elements = new Elements();

    public void homePage()
    {
        driver.get("https://www.instagram.com/accounts/login/");
        elements.waitForSomeTime();
    }

//    public void loginLink()
//    {
//        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
//    }

    public void userCredentials()
    {
        driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP' and @aria-label=\"Phone number, username, or email\"]")).sendKeys("ali1977");
        elements.waitForSomeTime();
        driver.findElement(By.xpath("//div[@class='f0n8F ']//input[@class='_2hvTZ pexuQ zyHYP' and @aria-label=\"Password\" and @type='password']")).sendKeys("12345*");
        elements.waitForSomeTime();
    }

    public void loginButton()
    {
        driver.findElement(By.xpath("//span[@class='-Qhn2 _1OSdk']//button[@class='_5f5mN       jIbKX KUBKM      yZn4P   ']")).click();
        elements.waitForSomeTime();
    }

    public void welcomeScreen()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='Szr5J kIKUG coreSpriteDesktopNavProfile']")).isDisplayed());

    }

    public void invalidCredentials()
    {
        driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP' and @aria-label=\"Phone number, username, or email\"]")).sendKeys("ali");
        elements.waitForSomeTime();
        driver.findElement(By.xpath("//div[@class='f0n8F ']//input[@class='_2hvTZ pexuQ zyHYP' and @aria-label=\"Password\" and @type='password']")).sendKeys("123456*");
        elements.waitForSomeTime();
    }

    public void errorMessage()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='slfErrorAlert']")).isDisplayed());
    }
}
