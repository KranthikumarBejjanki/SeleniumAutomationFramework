package Utils;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SuiteListener implements ITestListener {
	
	 @Override		
     public void onTestStart(ITestResult iTestResult) 
	 {					
         // TODO Auto-generated method stub				
         		
     }
	
	 @Override		
     public void onTestSuccess(ITestResult iTestResult) 
	 {					
         // TODO Auto-generated method stub
     		
 }	
	 
	public void onFinish(ITestResult iTestResult) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onStart(ITestContext iTestResult) {					
        // TODO Auto-generated method stub				
        		
    }	
    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult iTestResult)
    {					
    	String filename=System.getProperty("user.dir")+File.separator+"screenshots"+File.separator+iTestResult.getMethod().getMethodName();
    	//File f=((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.FILE);
   

        
	
    }	

}
