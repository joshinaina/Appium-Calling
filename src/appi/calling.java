package appi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class calling
{
	AndroidDriver driver;
	@Test
	public void rohitgnumber() throws MalformedURLException, InterruptedException
	{  
		DesiredCapabilities capability=new DesiredCapabilities();
		capability.setCapability("deviceName","Galaxy J3");//inside capabity what you are typing is case sensetive.So do not write small or capital.
		capability.setCapability("platformName","Android");
		capability.setCapability("platformVersion","5.1.1");
		capability.setCapability("appPackage","com.android.contacts");
		capability.setCapability("appActivity","com.android.contacts.activities.PeopleActivity");
		//driver =new AndroidDriver(new URL("http://127.0.0.1:4727/wd/hub"),capability);
	     driver =new AndroidDriver(new URL("http://127.0.0.14:4728/wd/hub"),capability);
		driver.findElement(By.linkText("Phone")).click();
		driver.findElementByAccessibilityId("0Button").click();
		driver.findElementByAccessibilityId("2Button").click();
		driver.findElementByAccessibilityId("2Button").click();
		driver.findElementByAccessibilityId("4Button").click();
		driver.findElementByAccessibilityId("6Button").click();
		driver.findElementByAccessibilityId("6Button").click();
		driver.findElementByAccessibilityId("4Button").click();
		driver.findElementByAccessibilityId("1Button").click();
		driver.findElementByAccessibilityId("1Button").click();
		driver.findElementByAccessibilityId("9Button").click();

	
		
	}

}
