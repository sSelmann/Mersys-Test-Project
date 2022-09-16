package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _GR5_8_Departments {
    DialogContent dc = new DialogContent();

    @And("Click delete Button on Dialog Content")
    public void clickDeleteButtononDialogContent(DataTable elements) {

        dc.waitUntilClickable(dc.deleteButton);
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("Click edit button on Dialog Content")
    public void ClickeditButtononDialogContent(DataTable elements) {

        dc.waitUntilClickable(dc.editButton);
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

}
