package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(xpath="//*[@id=\"username\"]")
    private static WebElementFacade campoUsername;

    @FindBy(xpath="//*[@id=\"password\"]")
    private static WebElementFacade campoPassword;

    @FindBy(xpath="/html/body/div[2]/div/div/form/button/i")
    private static WebElementFacade botaoLogin;

    public void preencherPassword(String password) {
        campoPassword.sendKeys(password);
    }

    public void preencherUserName(String username) {
        campoUsername.sendKeys(username);
    }

    public void clicaEmLogin() {
        botaoLogin.click();
    }
}
