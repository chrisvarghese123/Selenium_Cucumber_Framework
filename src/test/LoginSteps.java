import Pages.LoginPage;
import Pages.homePage;
import com.christy.Framework.Base.BasePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import sun.security.jca.GetInstance;

public class LoginSteps extends BasePage
{
    @Given("^i verify the application has opened$")
    public void iVerifyTheApplicationHasOpened()
    {
       // LoginPage= GetInstance(LoginPage.class);



    }

    @And("^clicked on the login Link$")
    public void clickedOnTheLoginLink()
    {
        Assert.assertTrue(homePage.IsLoginLink());
        homePage.lnkLogin();



    }
}
