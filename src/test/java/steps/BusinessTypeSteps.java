package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.BusinessTypePage;



public class BusinessTypeSteps {

    BusinessTypePage businessTypePage = new BusinessTypePage();

    @Given("the user click  individu button")
    public void individuBtn(){
        businessTypePage.individuBtn();
    }

    @When("the user click lanjutkan button")
    public void submitBtn(){
        businessTypePage.lanjutkanBtn();
    }

    @When("the ask permission popup appears")
    public void popupPermission(){
        Assertions.assertTrue(businessTypePage.askPermission());
    }

    @When("click iya button")
    public void yaBtn(){
        businessTypePage.btnYa();
    }

    @Then("the result will directly to business information page")
    public void bussineesPermissionPage(){
        Assertions.assertFalse(businessTypePage.permissionPage());
    }
    @When("the user input merchant name {}")
    public void inputMerchantNameField(String merchantName) throws InterruptedException {
        businessTypePage.waitABit(3);
        businessTypePage.inputMerchantNameField(merchantName);
    }

    @When("the user select the category merchant")
    public void categoryBtn(){
        businessTypePage.btnDropdown();
    }

    @Then("the user input domain url {}")
    public void inputdomainURL(String domainUrl) throws InterruptedException {
       businessTypePage.waitABit(3);
       businessTypePage.inputDomainUrl(domainUrl);
    }
    @Then("the user input address {}")
    public void inputAddrsss(String addresssJenisUsaha)throws InterruptedException {
        businessTypePage.waitABit(3);
        businessTypePage.inputDomainUrl(addresssJenisUsaha);
    }
    @Then("the user input mailing address {}")
    public void inputMailingAddress(String addresssJenisUsaha) throws InterruptedException {
            businessTypePage.waitABit(3);
            businessTypePage.inputDomainUrl(addresssJenisUsaha);
    }

    @Then("the user input owner name {}}")
    public void inputOwnername(String directorName)throws InterruptedException {
        businessTypePage.waitABit(3);
        businessTypePage.inputDomainUrl(directorName);
    }
}
