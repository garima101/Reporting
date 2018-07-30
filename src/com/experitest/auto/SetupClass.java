package com.experitest.auto;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterSuite;

public class SetupClass {
	
@AfterSuite
public void teardown() {
	Result();
   
}
	
public void Result() {
		String OutputDir = System.getProperty("user.dir") + "\\test-output";
		String dirc = new SimpleDateFormat("yyyyMMddHHmm'.html'").format(new Date());
		File Dirc = new File(OutputDir + "//" + dirc);
		Dirc.mkdir();
		File source = new File(OutputDir + "\\index.html");
		String fileName = new SimpleDateFormat("yyyyMMddHHmm'.html'").format(new Date());
		File Destination = new File(OutputDir + "\\" + dirc + "\\" + fileName);
		try {
			FileUtils.copyFile(source, Destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
