package org.genericLibrary;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListener extends BaseTest implements ITestListener{

		@Override
		public void onTestStart(ITestResult result) {
			Reporter.log("TestCase "+result.getName()+" has started",true);
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			Reporter.log("TestCase "+result.getName()+" has succeseesfully exucuted",true);
		}

		@Override
		public void onTestFailure(ITestResult result) {
			String ldt = LocalDateTime.now().toString();
			String dateTime = ldt.replaceAll(":", "-");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			ts.getScreenshotAs(OutputType.FILE);
			
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			Reporter.log("TestCase "+result.getName()+" has Skipped",true);
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			Reporter.log("TestCase "+result.getName()+" hasfailed with some success precentage",true);
		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {
			Reporter.log("TestCase "+result.getName()+" has failed due to timeout",true);
		}

		@Override
		public void onStart(ITestContext context) {
			Reporter.log("<Test> "+context.getName()+" has started",true);
		}

		@Override
		public void onFinish(ITestContext context) {
			Reporter.log("<Test> "+context.getName()+" has finished",true);
	
	}
}
