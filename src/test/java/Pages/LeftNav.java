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

        }

        clickFunction(myElement);
    }

}
