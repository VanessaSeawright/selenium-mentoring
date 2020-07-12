package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.CheckboxesSteps;
import steps.HomeSteps;

@RunWith(SerenityRunner.class)
public class CheckBoxTest {

    @Steps
    private HomeSteps homePage;

    @Steps
    private CheckboxesSteps checkboxes;

    @Managed
    WebDriver driver;

    @Test
    public void shouldClickCheckbox(){
        homePage.irParaPaginaDeCheckbox();
        checkboxes.marcarCheckbox1();
        checkboxes.desmarcarCheckbox2();


    }
}
