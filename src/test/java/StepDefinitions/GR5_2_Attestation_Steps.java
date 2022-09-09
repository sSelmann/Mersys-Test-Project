package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GR5_2_Attestation_Steps {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @Then("User Add A Attestation")
    public void userAddAAttestation() {

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","zxcvb");
        dc.findAndClick("saveButton");
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","successfully");

    }

    @Then("User Edit A Attestation")
    public void userEditAAttestation() {
        dc.findAndSend("searchInput","zxcvb");
        dc.findAndClick("searchButton");
        dc.waitUntilVisible(dc.editButton);
        dc.findAndClick("editButton");
        dc.findAndSend("nameInput","qwert");
        dc.findAndClick("saveButton");
    }

    @Then("User Delete A Attestation")
    public void userDeleteAAttestation() {
        dc.findAndSend("searchInput","qwert");
        dc.findAndClick("searchButton");
        dc.waitUntilVisible(dc.deleteButton);
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");

    }

    @When("Navigate To Attestations Page")
    public void navigateToAttestationsPage() {

        ln.findAndClick("humanResources");
        ln.findAndClick("setupUnderHumanResource");
        ln.findAndClick("AttestationsUnderHR");
    }
}
