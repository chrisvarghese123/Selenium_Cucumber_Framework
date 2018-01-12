package com.christy.Framework.Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FrameworkInitialize extends BasePage
{
    public void InitializeBrowser(BrowserTypes types)
    {
        switch (types)
        {
            case Chrome:
            {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("disable-infobars");
                options.addArguments("--start-maximized");
                System.setProperty("webdriver.chrome.driver","C:\\Christy_WorkSpace\\Softwares\\SeleniumDrivers\\chromedriver.exe");
                DriverContext.driver = new ChromeDriver(options);
                break;
            }
            case Firefox:
            {
                DriverContext.driver = new FirefoxDriver();
                break;
            }

            case IE:
                {
                    DriverContext.driver = new InternetExplorerDriver();
                    break;
                }
        }


    }

}
