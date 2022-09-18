package StepDefinitions;
import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _GR5_10_DocumentSteps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("Going to Document")
    public void goingToDocument() {

        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("documentTypesUnderParameters");

    }

    @And("DocumentAdd")
    public void _GR5_10_DocumentSteps(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }


    @And("Documentinfo")
    public void documentinfo(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("DocumentStage")
    public void documentstage(DataTable elements) {

        dc.waitUntilVisible(dc.stage2);

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }
}
