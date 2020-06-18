package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage;

    @Step
    public void InserirDadosDeLogin() {
        loginPage.preencherUserName("tomsmith");
        loginPage.preencherPassword("SuperSecretPassword!");

    }

    @Step
    public void ClicaEmLogin() {
        loginPage.clicaEmLogin();

    }
}
