package resources;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;

public class ExtentReportsNG {
	static ExtentReports extent;

	public static ExtentReports getReports() {
		String path = System.getProperty("user.dir") + "/reports/index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Rediff Test Report");
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setReportName("Nabeel Umar Andoorathodi");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Nabeel");

		return extent;

	}

}
