


	
	package appi;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.remote.MobileCapabilityType;

	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.BrowserType;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.Test;
	public class ium 
	{
	    @Test
	    public void kk() throws InterruptedException, MalformedURLException
	    {
	        //Create object of desired capibilty class and specifiy android plate form
	        DesiredCapabilities capabilities=DesiredCapabilities.android();
	        //set the capability to execute test in chrome browser
	        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
	        //set the capability to execute test in android plateform
	        capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
	        //we need to define plateform name
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        //set device name as well
	        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "my phone");
	        //set android version as well
	        capabilities.setCapability(MobileCapabilityType.VERSION, "5.1.1");
	        //Create object urlclass and specify the appium server address
	        URL url=new URL("http://127.0.0.14:4728/wd/hub");
	        //Create object of androiddriver class and pass the url and capibility that we created
	        WebDriver driver=new AndroidDriver(url,capabilities);
	        //open url
	        driver.get("http://www.facebook.com");
	        //Print title
	        System.out.println("Title"+driver.getTitle());
	        //Enter username
	        driver.findElement(By.className("inputtext")).sendKeys("ramasharma023@gmail.com");
	        //Enter password
	        driver.findElement(By.id("pass")).sendKeys("hhhhh");
	        //clicking on button
	        driver.findElement(By.id("u_0_5")).click();
	        Thread.sleep(5000);
	        //close browser
	        //driver.quit();
	    }
	}

	
	


