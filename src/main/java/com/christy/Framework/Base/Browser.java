package com.christy.Framework.Base;

public class Browser

{


    public void GotoURL(String URL) {
        DriverContext.driver.navigate().to(URL);

    }
    public void ClosePage()
    {
        DriverContext.driver.quit();
    }
}


