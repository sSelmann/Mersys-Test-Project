package Runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/_GR5-8_Departments.feature"},
        glue = {"StepDefinitions"}
)
@Listeners({ExtentITestListenerClassAdapter.class})
public class _GR5_8_DepartmentsRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {

        ExtentService.getInstance().setSystemInfo("User Name", "Selman Tanis");
        ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "When we come to Human setup->School Setup->Departments \" +\n" +
                "                \"It has been tested whether add, edit, active and delete functions are tested.");
    }
}
