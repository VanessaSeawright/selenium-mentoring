package steps;

import net.thucydides.core.annotations.Step;
import pages.FeaturePage;

public class FeatureSteps {
    private FeaturePage featurePage;

    @Step
    public void openFeaturePage(){

        featurePage.open();
        featurePage.waitOnPage();
    }

    @Step
    public void shouldSeeTheInternetHomePage(){
        assert(featurePage.containsAllText("Welcome to the-internet"));
    }
}
