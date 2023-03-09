package com.framework.orangehrm;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class screenshot extends Baseclass{

	//SCREENSHOT
		public void scnsht() throws IOException 
		{
			Calendar cal = Calendar.getInstance();
			Date time = cal.getTime();
			String filename = time.toString().replace(" "," -- ").replace(":", "");
			File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourcefile, new File("./Screenshot/"+filename+".png"));
		}
		

}
