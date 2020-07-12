package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckboxesPage extends PageObject {
    @FindBy(xpath="/html/body/div[2]/div/div/form/input[1]")
    private static WebElementFacade checkbox1;

    @FindBy(xpath="/html/body/div[2]/div/div/form/input[2]")
    private static WebElementFacade checkbox2;


    public void clicarCheckBox1() {
        checkbox1.click();
    }

    public void clicarCheckBox2() {
        checkbox2.click();
    }
}


