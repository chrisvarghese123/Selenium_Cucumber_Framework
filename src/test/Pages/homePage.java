package Pages;

import com.christy.Framework.Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePage extends BasePage
{
    public homePage()
    {

    }

    @FindBy(how = How.PARTIAL_LINK_TEXT,using = "Sign in")
    public static WebElement lnkLogin;


    public static void lnkLogin()
    {
        lnkLogin.click();
    }

    public static boolean IsLoginLink()
    {
        return lnkLogin.isDisplayed();
    }


}
