package steps;

import pages.HomePage;

public class HomeSteps {
    HomePage homepage;

    public void irParaPaginaDeLogin() {
        homepage.open();
        homepage.clicarEmLogin();
    }
}

