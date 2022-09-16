package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _GR5_1_PositionCategoriesSteps {

    DialogContent dc = new DialogContent();

    @When("Success message should be displayed")
    public void clickOnTheElementInTheDialog() {
        dc.findAndContainsText("successMessage", "success");
    }

    @And("Click delete on Popup")
    public void clickDeleteOnPopup(DataTable elements) {

        dc.waitUntilClickable(dc.deleteDialogBtn4);
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }
}
