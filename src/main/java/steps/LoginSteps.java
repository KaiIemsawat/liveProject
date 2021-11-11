package steps;

import impl.LoginImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.WebDriverUtils;

import java.sql.SQLOutput;

public class LoginSteps {
    LoginImpl impl = new LoginImpl();

    @Given("I navigate to loginPage")
    public void iNavigateToLoginPage() {
        impl.navToLoginPage();
    }

    @When("I input {string} as {string}")
    public void iInputAs(String fieldName, String value) {
        switch (fieldName.toLowerCase()) {
            case "username":
                impl.getPage().uNameInput.sendKeys(value);
                break;
            case "password":
                impl.getPage().pWordInput.sendKeys(value);
                break;
            default:
                System.out.println("Field is not found....!!");
        }
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        impl.getPage().loginBtn.click();
    }

    @Then("The display should say Welcome {string} !")
    public void theDisplayShouldSayWelcome(String userFName) {
        Assert.assertEquals("Welcome " + userFName + "!", impl.getPage().welcomeMSG.getText());

        WebDriverUtils.quitDriver();
    }


    @Then("The the title should be {string}")
    public void theTheTitleShouldBe(String titleName) {
        Assert.assertEquals(titleName, WebDriverUtils.getDriver().getTitle());
        WebDriverUtils.quitDriver();
    }

}
