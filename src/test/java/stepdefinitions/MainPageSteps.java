package stepdefinitions;

import constants.Languages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.Getter;
import org.testng.Assert;
import pages.MainPage;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();

    @Getter
    private static String searchInput;

    @Then("I verify if the Main Page is open")
    public void assertIfMainPageIsOpen() {
        Assert.assertTrue(mainPage.state().isDisplayed(), "Main Page is not displayed.");
    }

    @When("I click submit button")
    public void clickSubmitButton() {
        mainPage.submitSearch();
    }

    @When("I input {string} in search field")
    public void searchForArticle(String article) {
        mainPage.inputSearch(article);
        searchInput = article;
    }

    @When("I change search language to {string}")
    public void changeSearchLanguage(String language) {
        Languages selectedLanguage = Languages.valueOf(language.toUpperCase());
        mainPage.selectLanguage(selectedLanguage.getValue());
    }
}
