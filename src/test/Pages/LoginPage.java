package Pages;

import com.christy.Framework.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage
{
    public LoginPage()
    {

    }



    @FindBy(how = How.NAME,using = "txtLogin")
    public static WebElement txtUsername;

    @FindBy(how = How.NAME,using = "txtpassword")
    public static WebElement txtPassword;


    @FindBy(how = How.ID_OR_NAME,using = "btnSubmit")
    public static WebElement btnButton;




    public void Login(String username, String password)
    {

        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
        btnButton.click();

    }

    public static boolean isUsername()
    {
        return txtUsername.isDisplayed();
    }

    public static boolean isPassword()
    {
        return txtPassword.isDisplayed();
    }
    public static boolean isLoginBTN()
    {
        return btnButton.isDisplayed();
    }




}
