package Selenium_Tests;

import com.christy.Framework.Base.BrowserTypes;
import com.christy.Framework.Base.DriverContext;
import com.christy.Framework.Base.FrameworkInitialize;
import com.christy.Framework.Confiuration.ConfigReader;
import com.christy.Framework.Confiuration.Settings;
import org.junit.Before;

public class TestInitialize extends FrameworkInitialize
{
    @Before
    public void initialize()
    {
        ConfigReader.PopulateSettings();

        InitializeBrowser(BrowserTypes.Chrome);

        DriverContext.driver.navigate().to(Settings.HomeURL);

    }

}
