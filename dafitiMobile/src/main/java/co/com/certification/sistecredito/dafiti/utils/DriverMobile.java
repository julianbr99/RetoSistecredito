package co.com.certification.sistecredito.dafiti.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverMobile {
    public static WebDriver dafitiApplication() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Wiliam");
        capabilities.setCapability("platformName", "ANDROID");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("appPackage", "br.com.dafiti");
        capabilities.setCapability("appActivity", "br.com.dafiti.activity.SplashSelectCountry_");
        capabilities.setCapability("noReset", false);
        //capabilities.setCapability(AndroidMobileCapabilityType., false);


        try {
            return new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

