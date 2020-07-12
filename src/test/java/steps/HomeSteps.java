package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomeSteps {
    HomePage homepage;

    @Step
    public void irParaPaginaDeLogin() {
        homepage.open();
        homepage.clicarEmLogin();
    }

    public void irParaPaginaDeCheckbox() {
        homepage.open();
        homepage.ClicarLinkCheckboxes();
    }
}

