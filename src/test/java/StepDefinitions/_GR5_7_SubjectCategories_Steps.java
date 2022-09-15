package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _GR5_7_SubjectCategories_Steps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Going to Education Setup Subject Categories")
    public void goingToEducationSetupSubjectCategories() {
        ln.findAndClick("education");
        ln.findAndClick("setupUnderEducation");
        ln.findAndClick("subjectCategoriesUnderEducation");
    }

    @And("Add")
    public void Add(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            dc.findAndClick(listElement.get(i));
        }
    }

    @And("Info")
    public void Info(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Search Info")
    public void searchInfo(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Search")
    public void search(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            dc.findAndClick(listElement.get(i));
        }
    }

    @And("ActiveAndDeactive")
    public void activeanddeactive(DataTable elements) throws InterruptedException {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }

    }
}
