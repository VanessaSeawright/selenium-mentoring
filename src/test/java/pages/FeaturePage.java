package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/")
public class FeaturePage extends PageObject {

    @FindBy(xpath="//*[@id=\"content\"]/div/div[1]/div[1]/div[1]/span")
    private static WebElementFacade boardName;

    public static String getBoardName() {
        return boardName.getText();
    }
}