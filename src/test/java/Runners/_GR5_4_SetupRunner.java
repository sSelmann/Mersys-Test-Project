package Runners;

import Utilities.GWD;
import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_Gr5-4_SetupFields.feature"},
        glue = {"StepDefinitions"}
)

@Listeners({ExtentITestListenerClassAdapter.class})
public class _GR5_4_SetupRunner extends AbstractTestNGCucumberTests{



@AfterClass
public static void writeExtentReport(){
        ExtentService.getInstance().setSystemInfo("User Name","Berk Çelikel");
        ExtentService.getInstance().setSystemInfo("Application Name","Campus");
        ExtentService.getInstance().setSystemInfo("Operating System Info",System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department","QA");
        ExtentService.getInstance().setSystemInfo("Ek Satır","Setup Fields Add-Edit-Delete");
        }
        }


