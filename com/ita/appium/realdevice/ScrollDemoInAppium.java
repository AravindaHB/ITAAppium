package com.ita.appium.realdevice;

import org.testng.annotations.Test;

import com.ita.appium.utils.AndroidUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollDemoInAppium extends AndroidUtils{

	AndroidDriver<AndroidElement> driver = null;
	
	@Test
	public void scrollTestToElement()
	{
		driver = getMyAppiumDriver(appName, "Android device");
		//"attribute("value")"
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		
		
	}
}
