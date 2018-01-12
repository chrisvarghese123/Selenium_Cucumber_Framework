package com.christy.Framework.Base;

import org.openqa.selenium.support.PageFactory;

public abstract class BasePage
{
    public BasePage()
    {
        PageFactory.initElements(DriverContext.driver,this);

    }
}
