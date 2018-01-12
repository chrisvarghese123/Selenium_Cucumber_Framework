package Selenium_Tests;

import Pages.LoginPage;
import Pages.homePage;
import com.christy.Framework.Confiuration.Settings;
import org.junit.Test;

public class LoginTest extends TestInitialize
{

    @Test
    public void Login()
    {
        LoginPage loginPage = new LoginPage();
        homePage homePage = new homePage();
        homePage.lnkLogin();
        loginPage.Login(Settings.loginEmail,Settings.loginPassword);

    }
}
