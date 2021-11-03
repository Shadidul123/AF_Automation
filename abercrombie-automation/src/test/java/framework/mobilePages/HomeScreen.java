package framework.mobilePages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;


public class HomeScreen extends MobileBasePage {







    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SKIP ']")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement skipButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.widget.Button[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement mainMenu;

    public void tapOnSkipButton() {

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("mobileReport3.html");
        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
        ExtentTest test1 = extentReports.createTest("mobile Test 1");


        tapOn(skipButton);
        test1.pass("clicked Skip Button");

        extentReports.flush();
    }

    public void tapOnMainMenuButton() {

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("mobileReport4.html");
        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
        ExtentTest test1 = extentReports.createTest("mobile Test 1");
        tapOn(mainMenu);
        test1.pass("clicked Main Menu");

        extentReports.flush();
    }
}
