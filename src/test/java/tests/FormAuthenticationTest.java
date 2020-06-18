package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import steps.FeatureSteps;
import steps.HomeSteps;
import steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class FormAuthenticationTest {

    @Steps
    private FeatureSteps steps;

    @Steps
    private HomeSteps homePage;

    @Steps
    private LoginSteps paginaDeLogin;

    @Managed
    WebDriver driver;

    @Test
    public void shouldLoginWithValidData(){
        homePage.irParaPaginaDeLogin();
        paginaDeLogin.InserirDadosDeLogin();
        paginaDeLogin.ClicaEmLogin();
    }
}
