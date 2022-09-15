package StepDefinitions;

import Pages.LeftNav;
import io.cucumber.java.en.And;
public class GR5_2_Attestation_Steps {

    LeftNav ln=new LeftNav();
    @And("Going to Human Resources Setup Attestations")
    public void goingToHumanResourcesSetupAttestations() {
        ln.findAndClick("humanResources");
        ln.findAndClick("setupUnderHumanResource");
        ln.findAndClick("AttestationsUnderHR");


    }
}
