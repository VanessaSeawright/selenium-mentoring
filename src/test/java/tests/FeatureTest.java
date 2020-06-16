package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.FeatureSteps;

@RunWith(SerenityRunner.class)
public class FeatureTest {

    @Steps
    private FeatureSteps steps;

    @Managed
    WebDriver driver;

    @Test
    public void shouldDisplayBoardOnBrowser(){
        steps.openFeaturePage();
    }

}
