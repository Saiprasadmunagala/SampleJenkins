package com.ams.comcast.genericutility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	@BeforeMethod
	public void BeforeMethodMethod() {
		System.out.println("Before method is executed");
	}
	
	@AfterMethod
	public void AfterMethodMethod() {
		System.out.println("After method is executed");
	}

}
