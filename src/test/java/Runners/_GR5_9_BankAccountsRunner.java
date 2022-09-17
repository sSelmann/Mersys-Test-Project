package Runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_GR5-9_BankAccounts.feature"},
        glue = {"StepDefinitions"}

)
@Listeners({ExtentITestListenerClassAdapter.class})
public class _GR5_9_BankAccountsRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {

        ExtentService.getInstance().setSystemInfo("User Name", "Beyda Erol");
        ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "Setup ->Parameters->Bank Accounts'a geldiğimizde " +
                "add,edit ve delete işlemlerinin istenildiği gibi yapılıp yapılmadığı test edilmiştir.");


    }
}
