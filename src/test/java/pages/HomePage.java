package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://the-internet.herokuapp.com")
public class HomePage extends PageObject {

    @FindBy(xpath="/html/body/div[2]/div/ul/li[21]/a")
    private static WebElementFacade linkFormAuthentication;

    public void clicarEmLogin() {
        linkFormAuthentication.click();
    }
}
