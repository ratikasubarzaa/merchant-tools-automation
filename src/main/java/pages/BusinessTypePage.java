package pages;

import base.BasePageObject;
import org.openqa.selenium.WebElement;
import static locators.businessTypeLocator.*;


public class BusinessTypePage extends BasePageObject  {

    public void individuBtn() {
        waitABit(5);
        click( BUTTON_INDVIDU);
    }

    public void btnYa() {
        waitABit(3);
        click( BUTTON_YA_USAHA);
    }

    public void lanjutkanBtn() {
        waitABit(3);
        click( BUTTON_LANJUTKAN);
    }

    public void categoryBtn() {
        waitABit(1);
        click( BUTTON_CATEGORY);
    }

    public void btnSubmit() {
        waitABit(1);
        click( BUTTON_SUBMIT);
    }

    public void btnCheckbox() {
        waitABit(1);
        click( BUTTON_CHECKBOX);
        click(BUTTON_CHECKBOX);
    }

    public void btnDropdown() {
        waitABit(3);
        click( BUTTON_DROPDOWN);
    }

    public void inputMerchantNameField(String text) throws InterruptedException {
        WebElement element = find(FIELD_MERCHANT_NAME);
        element.sendKeys(text);
    }

    public void inputCompanyeName(String text) throws InterruptedException {
        WebElement element = find(FIELD_COMPANY_NAME);
        element.sendKeys(text);
    }

    public void inputDomainUrl(String text) throws InterruptedException {
        WebElement element = find(FIELD_DOMAIL_URL);
        element.click();
        element.wait(2);
        element.sendKeys(text);
    }

    public void inputMailing(String text) throws InterruptedException {
        WebElement element = find(FIELD_MAILING_ADDRESS);
        element.click();
        element.wait(2);
        element.sendKeys(text);
    }
    public void inputDirectorName(String text) throws InterruptedException {
        WebElement element = find(FIELD_KTP_NUMBER);
        element.click();
        element.wait(2);
        element.sendKeys(text);
    }

    public void inputRecepientEmail(String text) throws InterruptedException {
        WebElement element = find(FIELD_NOTIFICATION_EMAIL);
        element.click();
        element.wait(2);
        element.sendKeys(text);
    }

    public void inputCustomerService(String text) throws InterruptedException {
        WebElement element = find(FIELD_EMAIL_CUSTOMER_SERVICE);
        element.click();
        element.wait(2);
        element.sendKeys(text);
    }
    public boolean askPermission(){
        try {
            return isDisplayed(POUP_UP_ASK_PERMISSION);

        }catch(Exception e) {
            return false;
        }
    }

    public boolean permissionPage(){
        try {
            return isDisplayed(LABEL_Permission_page);

        }catch(Exception e) {
            return true;
        }
    }
    public boolean listDropdown(){
        try {
            return isDisplayed(LIST_DROPDWON);

        }catch(Exception e) {
            return true;
        }
    }

//    Informasi Penanggung Jawab

    public void inputfieldPIC(String text) throws InterruptedException {
        WebElement element = find(FIELD_PIC_Business);
        element.wait(2);
        element.sendKeys(text);
    }

    public void inputJabatan(String text) throws InterruptedException {
        WebElement element = find(FIELD_jabatan);
        element.wait(2);
        element.sendKeys(text);
    }
}
