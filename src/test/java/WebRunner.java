import com.aventstack.extentreports.ExtentReports;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;





@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/"},
        tags = "@smoke",
        plugin = {"json:target/cucumber.json", "html:target/cucumber-html-report.html"})
public class WebRunner {


    private static ExtentReports extent;
    @BeforeClass
    public static void PathFolderCretion() {
        DateFormat timeFormat = new SimpleDateFormat("HH.mm.ss");
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Calendar cal = Calendar.getInstance();
//        ExtentReports extent;
//        String Path = "./ExtentReport.html";
//        System.out.println(Path);
//        extent = new ExtentReports();

    }
}
