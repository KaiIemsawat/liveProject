package impl;

import pages.LoginPage;
import utils.ConfigReader;
import utils.WebDriverUtils;

import java.util.Locale;

public class LoginImpl {
    private LoginPage page;

    public LoginPage getPage() {
        if(page == null) {
            page = new LoginPage();
        }
        return page;
    }

    public void navToLoginPage() {
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
    }

}
