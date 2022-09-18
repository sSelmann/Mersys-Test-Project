package Runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;
@CucumberOptions(

        features = {"src/test/java/FeatureFiles/_GR5-7_EducationSubjectCategories.feature"},
        glue = {"StepDefinitions"}
)
@Listeners({ExtentITestListenerClassAdapter.class})
public class _GR5_7_EducationSubjectCategoriesRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {

        ExtentService.getInstance().setSystemInfo("User Name", "Bahadır Kaya");
        ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Education->Setup->Subject Categories'e geldiğimizde " +
                "add,edit,active ve delete işlemlerinin istenildiği gibi yapılıp yapılmadığı test edilmiştir.");
    }
}
