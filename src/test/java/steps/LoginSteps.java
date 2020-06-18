package steps;

import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage;

    public void InserirDadosDeLogin() {
        loginPage.preencherUserName("tomsmith");
        loginPage.preencherPassword("SuperSecretPassword!");

    }

    public void ClicaEmLogin() {
        loginPage.clicaEmLogin();

    }
}
