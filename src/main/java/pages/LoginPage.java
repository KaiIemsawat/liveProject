package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }
    @FindBy(name = "email")
    public WebElement uNameInput;

    @FindBy(name = "password")
    public WebElement pWordInput;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginBtn;

    @FindBy(id = "welcome_msg")
    public WebElement welcomeMSG;

    @FindBy(xpath = "//head/title")
    public WebElement pageTitle;
}
