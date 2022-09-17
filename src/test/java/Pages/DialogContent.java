package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath="//ms-save-button//button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button//span")
    private WebElement searchButton;

    @FindBy(xpath = "(//ms-text-field//input)[1]")
    private WebElement searchInput2;

    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "(//input[@id='ms-text-field-3'])[1]")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityCode;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "(//input[@id='ms-text-field-2'])[1]")
    private WebElement description;

    @FindBy(xpath = "//ms-edit-button//button")
    public WebElement editButton;

    @FindBy(xpath = "(//*[contains(@class,'mat-select-arrow-wrapper ng')])[3]")
    private WebElement arrowThree;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[4]")
    private WebElement dropDownOptionFour;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    private WebElement descriptionInput;

    //GR5-4//
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'GENERAL.BUTTON.ADD')]//button")
    private WebElement Add4;

    @FindBy(xpath = "(//ms-edit-button//button)[1]")
    public WebElement Edi4;

    @FindBy(xpath = "(//textarea[@formcontrolname='description']")
    public WebElement description2;

    @FindBy(xpath = "(//mat-option[@class='mat-option mat-focus-indicator mat-option-multiple mat-active ng-tns-c93-83 ng-star-inserted mat-selected']")
    public WebElement stage;


    @FindBy(xpath = "//mat-select[@formcontrolname='attachmentStages']")
    public WebElement stage2;

    @FindBy(xpath = "(//div[@class='ng-star-inserted']//button)[2]")
    public WebElement deleteDialogBtn4;

    @FindBy(xpath="//ms-masked-text-field[@formcontrolname='iban']//input")
    private WebElement ibanInput;

    @FindBy(xpath="(//span[contains(text(),'Currency')])[3]")
    private WebElement currency;

    @FindBy(xpath="(//span[contains(text(),'USD')])")
    private WebElement currencyUsa;

    @FindBy(xpath="//ms-text-field[@formcontrolname='integrationCode']//input")
    private WebElement integrationCodeBank;

    //GR5-4//

    @FindBy(xpath = "(//input[contains (@class,'mat-input-element')])[2]")
    public WebElement codeInput2;

    @FindBy(xpath = "//span[text()='Active']")
    public WebElement activeButton;

    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "nameInput" : myElement =nameInput; break;
            case "codeInput" : myElement =codeInput; break;
            case "shortName" : myElement =shortName; break;
            case "searchInput" : myElement =searchInput; break;
            case "searchInput2" : myElement =searchInput2; break;
            case "integrationCode" : myElement =integrationCode; break;
            case "priorityCode" : myElement =priorityCode; break;
            case "description" : myElement =description; break;
            case "descriptionInput" : myElement =descriptionInput; break;
            case "codeInput2" : myElement =codeInput2; break;
            case "description2" : myElement =codeInput2; break;
            case "ibanInput" : myElement =ibanInput; break;
            case "integrationCodeBank" : myElement = integrationCodeBank; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "addButton" : myElement =addButton; break;
            case "saveButton" : myElement =saveButton; break;
            case "closeDialog" : myElement =closeDialog; break;
            case "searchButton" : myElement =searchButton; break;
            case "deleteButton" : myElement =deleteButton; break;
            case "deleteDialogBtn" : myElement =deleteDialogBtn; break;
            case "acceptCookies" : myElement =acceptCookies; break;
            case "editButton" : myElement =editButton; break;
            case "Edi4" : myElement =Edi4; break;
            case "Add4" : myElement =Add4; break;
            case "deleteDialogBtn4" : myElement =deleteDialogBtn4; break;
            case "arrowThree" : myElement =arrowThree; break;
            case "dropDownOptionFour" : myElement =dropDownOptionFour; break;
            case "activeButton" : myElement =activeButton; break;
            case "stage" : myElement =stage; break;
            case "stage2" : myElement =stage2; break;
            case "currency" : myElement =currency; break;
            case "currencyUsa" : myElement =currencyUsa; break;
            //GR5-4

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "dashboard" : myElement =dashboard; break;
            case "successMessage" : myElement =successMessage; break;
            case "alreadyExist" : myElement =alreadyExist; break;


        }
        verifyContainsText(myElement,text);
    }


    public void SearchAndDelete(String searchText){

        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

        waitUntilLoading();
        findAndClick("deleteButton");// silme butonua bas
        findAndClick("deleteDialogBtn");// dilogdaki silme butonuna bas
    }
}
