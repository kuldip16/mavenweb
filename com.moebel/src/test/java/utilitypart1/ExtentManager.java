package utilitypart1;


import org.testng.ITestContext;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	 private static ExtentReports extent;
	 private static ITestContext context;
      
	    public synchronized static ExtentReports getInstance() {
	        if (extent == null) {
	            //File outputDirectory = new File(context.getOutputDirectory());
	            //File resultDirectory = new File(outputDirectory.getParentFile(), "html");
	            extent = new ExtentReports(util.getconfigvalue("filePath"));
	           // Reporter.log("Extent Report directory: " + resultDirectory, true);
	        }

	        return extent;
	    }

	    public static void setOutputDirectory(ITestContext context) {
	        ExtentManager.setContext(context);
	    }

		public static ITestContext getContext() {
			return context;
		}

		public static void setContext(ITestContext context) {
			ExtentManager.context = context;
		}

}
