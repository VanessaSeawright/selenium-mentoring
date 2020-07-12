package steps;

import pages.CheckboxesPage;

public class CheckboxesSteps {
    CheckboxesPage checkboxesPage;


    public void marcarCheckbox1() {
        checkboxesPage.clicarCheckBox1();
    }

    public void desmarcarCheckbox2() {
        checkboxesPage.clicarCheckBox2();
    }
}
