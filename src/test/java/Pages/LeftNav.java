package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupUnderHumanResource;

    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement positionCategoriesUnderHR;

    @FindBy(xpath = "//span[text()='Attestations']")
    private WebElement AttestationsUnderHR;

    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentTypesUnderParameters;

    @FindBy(xpath = "//span[text()='Fields']")
    private WebElement fieldsUnderParameters;

    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positionsUnderHR;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupUnderEducation;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategoriesUnderEducation;


    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetupUnderSetup;

    @FindBy(xpath = "//span[text()='Locations']")
    private WebElement locationUnderSchoolSetup;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departmentsUnderSchoolSetup;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccountsUnderSetupParameters;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevelsUnderSetupParameters;

    @FindBy(xpath = "//span[text()='Discounts']")
    private WebElement discountsUnderSetupParameters;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalitiesSetupParameters;

    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "setupOne" : myElement =setupOne; break;
            case "parameters" : myElement =parameters; break;
            case "humanResources" : myElement =humanResources; break;
            case "setupUnderHumanResource" : myElement =setupUnderHumanResource; break;
            case "positionCategoriesUnderHR" : myElement =positionCategoriesUnderHR; break;
            case "AttestationsUnderHR" : myElement =AttestationsUnderHR; break;
            case "documentTypesUnderParameters" : myElement =documentTypesUnderParameters; break;
            case "fieldsUnderParameters" : myElement =fieldsUnderParameters; break;
            case "positionsUnderHR" : myElement =positionsUnderHR; break;
            case "education" : myElement =education; break;
            case "setupUnderEducation" : myElement =setupUnderEducation; break;
            case "subjectCategoriesUnderEducation" : myElement =subjectCategoriesUnderEducation; break;
            case "schoolSetupUnderSetup" : myElement =schoolSetupUnderSetup; break;
            case "locationUnderSchoolSetup" : myElement =locationUnderSchoolSetup; break;
            case "departmentsUnderSchoolSetup" : myElement =departmentsUnderSchoolSetup; break;
            case "bankAccountsUnderSetupParameters" : myElement =bankAccountsUnderSetupParameters; break;
            case "gradeLevelsUnderSetupParameters" : myElement =gradeLevelsUnderSetupParameters; break;
            case "discountsUnderSetupParameters" : myElement =discountsUnderSetupParameters; break;
            case "nationalitiesSetupParameters" : myElement =nationalitiesSetupParameters; break;

        }

        clickFunction(myElement);
    }

}