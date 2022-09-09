package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class _GR5_4_SetupSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Fields Add")
    public void fieldsAdd(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }

    }

    @And("Fields Edit")
    public void fieldsEdit(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }
    @And("Fields İnfo")
    public void fieldsİnfo(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Save")
    public void save(DataTable elements) throws InterruptedException {
        dc.waitUntilVisible(dc.saveButton);
        //  Thread.sleep(1000);
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("ClickEditButton")
    public void clickeditbutton(DataTable elements) throws InterruptedException {
        Thread.sleep(1000);
        dc.waitUntilClickable(dc.Edi4);
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("Delete")
    public void delete(DataTable elements) throws InterruptedException {

        //    Thread.sleep(1000);
        dc.waitUntilVisible(dc.deleteButton);

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("DeleteDialogBtn")
    public void deletedialogbtn(DataTable elements) {

        dc.waitUntilClickable(dc.deleteDialogBtn4);
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @Then("User should login successfully2")
    public void userShouldLoginSuccessfully() {
            dc.findAndContainsText("successMessage", "success");
        }

    @And("Going To Fields")
    public void goingToFields() {

        ln.findAndClick("Setup4");
        ln.findAndClick("Parameters4");
        ln.findAndClick("Fields4");
    }
    }
