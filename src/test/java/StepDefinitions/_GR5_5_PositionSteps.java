package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class _GR5_5_PositionSteps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @Given("I can edit positions under Human Resources Setup")
    public void iCanEditPositionsUnderHumanResourcesSetup() {
        ln.findAndClick("humanResources");
        ln.findAndClick("setupUnderHumanResource");
        ln.findAndClick("positionsUnderHR");
    }

    @When("Add new position")
    public void addNewPosition(DataTable elements) {
        dc.findAndClick("addButton");

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

        dc.findAndClick("saveButton");
    }

    @When("Edit new position")
    public void editNewPosition(DataTable elements) {
        dc.findAndClick("editButton");

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

        dc.findAndClick("saveButton");
    }

    @When("Delete new position")
    public void deleteNewPosition(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

        dc.waitUntilVisible(dc.deleteButton);
        dc.findAndClick("searchButton");
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }
}
