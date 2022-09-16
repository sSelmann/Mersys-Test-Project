package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;

public class _GR5_11_DiscountSteps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @Given("i can edit the discounts under parameters")
    public void iCanEditTheDiscountsUnderParameters() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("discounts");
    }

    @When("Add new Discount")
    public void addNewDiscount(DataTable elements) {
        dc.findAndClick("addButton");

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

        dc.findAndClick("saveButton");
    }

    @When("Edit new Discount")
    public void editNewDiscount(DataTable elements) {
        dc.findAndSend("descriptionInput", "campus2");
        dc.findAndClick("searchButton");
        dc.findAndClick("editButton");

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

        dc.findAndClick("saveButton");
    }

    @When("Delete new Discount")
    public void deleteNewDiscount(DataTable elements) {
        List<List<String>> listElement2 = elements.asLists(String.class);

        for (int i = 0; i < listElement2.size(); i++)
            dc.findAndSend(listElement2.get(i).get(0), listElement2.get(i).get(1));

        dc.waitUntilVisible(dc.deleteButton);
        dc.findAndClick("searchButton");
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogBtn");
    }
}
