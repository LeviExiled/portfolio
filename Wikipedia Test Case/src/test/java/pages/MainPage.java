package pages;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private final ITextBox searchInput = getElementFactory().getTextBox(By.xpath("//input[@id='searchInput']"), "Search Input");
    private final IButton searchButton = getElementFactory().getButton(By.xpath("//i[contains(@class, 'search-icon')]"), "Search Button");
    private final IComboBox languageDropdown = getElementFactory().getComboBox(By.xpath("//select[@id='searchLanguage']"), "Language Dropdown", ElementState.EXISTS_IN_ANY_STATE);

    public MainPage() {
        super(By.xpath("//img[contains(@class, 'featured-logo')]"), "Main Page");
    }

    @Step("Input in search field")
    public void inputSearch(String text) {
        searchInput.clearAndType(text);
    }

    @Step("Click submit button")
    public void submitSearch() {
        searchButton.click();
    }

    @Step("Change search language")
    public void selectLanguage(String language) {
        languageDropdown.selectByValue(language);
    }
}
