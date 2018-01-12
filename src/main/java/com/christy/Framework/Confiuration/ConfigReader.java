package com.christy.Framework.Confiuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
    public static void PopulateSettings()
    {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }

    public void ReadProperty()
    {
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream(new File("C:/Christy_WorkSpace/Documents/Frameworks/Chris_Cucumber_JAVA-Refactored/src/main/java/com/christy/Framework/Confiuration/globalConfig.properties")));
        } catch (IOException e) {
            System.out.println("The Exception occured is " + e);
        }
        Settings.chromepath = pro.getProperty("chrome");
        Settings.loginEmail= pro.getProperty("username");
        Settings.loginPassword=pro.getProperty("password");
        Settings.HomeURL =pro.getProperty("URL");
    }

















   /* public static Properties pro;


    public static Properties ConfigReader()

    {
        pro= new Properties();
        try {
            pro.load(new FileInputStream(new File("C:\\Christy_WorkSpace\\Documents\\Frameworks\\Chris_Cucumber_JAVA-Refactored\\src\\main\\java\\com\\christy\\Framework\\Confiuration\\globalConfig.properties")));
        }  catch (Exception e) {
            System.out.println("Exception occured is"+e.getMessage());
        }
        return pro;
    }

    public String lnlLogin(String Propname)
    {
        return pro.getProperty(Propname);
    }*/
}
