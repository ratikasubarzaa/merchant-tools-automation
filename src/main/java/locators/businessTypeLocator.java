package locators;

import org.openqa.selenium.By;

public interface businessTypeLocator {

//    Input jenis usaha
    By BUTTON_INDVIDU = By.xpath("//body//div//button[2]");
    By BUTTON_LANJUTKAN = By.xpath("//button[@type='button']");

    By BUTTON_SCROLL = By.xpath("//div[contains(@class,'css-11unzgr')]");

    By BUKU = By.xpath("//div[contains(text(),'Buku')]");

    By BUTTON_CHECKBOX = By.xpath("(//input[@id='mantine-sv3zfc9my'])[1]");
    By BUTTON_DROPDOWN = By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]");

    By LIST_DROPDWON = By.xpath("/html/body/div[1]/section/main/div/form/div[1]/div[3]/div/div/div/div[2]/div/svg");
    By POUP_UP_ASK_PERMISSION = By.xpath("//div[@class='relative p-6 flex-auto']");
    By BUTTON_YA_USAHA= By.cssSelector("button[class='bg-[#fc843c] hover:bg-yellow-600 text-white py-2 px-5 rounded-md disabled:bg-gray-300 disabled:cursor-not-allowed']");

    By LABEL_Permission_page = By.xpath(" public void popupPermission(){\n" + "Assertions.assertTrue(merchantOnline.askPermission());\n" + "}");
    By FIELD_MERCHANT_NAME = By.xpath("//input[@id='merchantName']");
    By FIELD_COMPANY_NAME = By.cssSelector("//input[@id='companyName']");
    By BUTTON_CATEGORY = By.xpath("//body/div[@id='__next']/section[@class='flex flex-col w-full min-h-screen lg:flex-row']/main[@class='relative mt-12 lg:mt-0 w-full lg:ml-/div[1]");
    By BUTTON_CHANEL = By.xpath("//body/div[@id='__next']/section[@class='flex flex-col w-full min-h-screen lg:flex-row']/main[@class='relative mt-12 lg:mt-0 w-full lg:ml-[427px]']/div[1]//*[name()='svg']");
    By BUTTON_SUBMIT = By.xpath("//button[@type='submit']");
    By FIELD_DOMAIL_URL = By.xpath("//input[@id='url']");
    By FIELD_ADDRESS = By.xpath("//input[@id='address']");
    By FIELD_MAILING_ADDRESS= By.xpath("//input[@id='mailingAddress']");
    By FIELD_DIRECTOR_NAME = By.xpath("//input[@id='directorName']");
    By FIELD_NOTIFICATION_EMAIL = By.cssSelector("div[class='MultipleEmail_react-multi-email__KIs_G w-full px-3 py-2 shadow-none outline-none focus-within:outline-none focus-within:ring-0 focus-within:text-gray-800 mt-input-outline-light-blue-500 border-gray-300 mt-input-outline bg-transparent border border-1 rounded-lg focus-within:border-2 focus-within:border-light-blue-500 text-gray-800']");
    By FIELD_KTP_NUMBER = By.xpath("//input[@id='directorIdNumber']");
    By FIELD_EMAIL_CUSTOMER_SERVICE = By.xpath("//input[@id='csEmail']");

//    Input informasi penanggungjawab

    By FIELD_PIC_Business = By.cssSelector("input[placeholder=' '][name='picBusinessName']");
    By FIELD_jabatan = By.xpath("//input[@name='picBusinessPosition']");

}
