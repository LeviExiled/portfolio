package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.InformationPage;

public class InformationPageSteps {
    private final InformationPage informationPage = new InformationPage();

    @Then("I verify if the Information Page is open")
    public void isInformationPageDisplayed() {
        String searchInput = MainPageSteps.getSearchInput();
        Assert.assertTrue(
                informationPage.getHeaderText().contains(searchInput),
                "Information Page header does not contain the search input: " + searchInput);
    }
}
