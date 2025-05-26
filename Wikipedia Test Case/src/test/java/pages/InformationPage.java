package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class InformationPage extends Form {
    private final ILabel headerLocator = getElementFactory().getLabel(By.xpath("//h1[@id='firstHeading']"), "Header locator");

    public InformationPage() {
        super(By.xpath("//span[contains(@id, 'header-basic')]"), "Article Page");
    }

    @Step("Get text from header for assertion")
    public String getHeaderText() {
        return headerLocator.getText();
    }
}
