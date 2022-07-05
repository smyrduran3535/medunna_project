package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_015_Patients {

    public US_015_Patients(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Items&Titles']")
    public WebElement itemsTitles;
    @FindBy(xpath = "//span[.='Patient']")
    public WebElement patient;
    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createNewPatient;
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement editPatient;
    @FindBy(xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement deletePatient;
    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement confirmDelete;
    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement cancelDelete;
    @FindBy(xpath = "(//a[@class='page-link'])[9]")
    public WebElement lastPage;
    @FindBy(xpath = "//span[.='First Name']")
    public WebElement firstNameButton;
    @FindBy(xpath = "//span[.='Last Name']")
    public WebElement lastNameButton;
    @FindBy(xpath = "//a[.='109504']")
    public WebElement patientiId;
    @FindBy(xpath = "//td[.='839-97-7135']")
    public WebElement patientSsn;
    @FindBy(xpath = "(//*[text()='0000001Team83'])[1]")
    public WebElement patientFirstName;
    @FindBy(xpath = "(//*[text()='0000001Team83'])[2]")
    public WebElement patienLastName;
    @FindBy(xpath = "//*[text()='05/07/22 00:00']")
    public WebElement patientBirthDate;
    @FindBy(xpath = "//*[text()='223-223-2222']")
    public WebElement patientPhone;
    @FindBy(xpath = "//*[text()='0000001Team83@gmail.com']")
    public WebElement patientEmail;
    @FindBy(xpath = "//*[text()='Gender']")
    public WebElement patientGender;
    @FindBy(xpath = "//*[text()='O-']")
    public WebElement patientBloodGroup;
    @FindBy(xpath = "//*[text()='123mainst']")
    public WebElement patientAddress;
    @FindBy(xpath = "//*[text()='111']")
    public WebElement patientDescription;
    @FindBy(xpath = "//*[text()='05/07/22 14:06']")
    public WebElement patientCreatedDate;
    @FindBy(xpath = "//*[text()='waylon.rodriguezz']")
    public WebElement patientUser;
    @FindBy(xpath = "//*[text()='USA']")
    public WebElement patientCountry;
    @FindBy(xpath = "//*[text()='California']")
    public WebElement patinentStateCity;


}
