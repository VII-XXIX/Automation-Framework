package com.framework.orangehrm;

import org.testng.annotations.Test;

public class Demo extends Baseclass{
	@Test
	public void TC01() throws Exception
	{
		driver.get(URL);
		Thread.sleep(3000);
		Thread.sleep(3000);
	}
}
