package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ArticlePage;

public class ArticlePageSteps {
    private final ArticlePage articlePage = new ArticlePage();

    @When("I navigate to Download as PDF page")
    public void navigateToDownloadPDFPage() {
        articlePage.downloadAsPDF();
    }

    @When("I navigate to the Page Information")
    public void navigateToPageInformation() {
        articlePage.navigateToPageInformation();
    }

    @Then("I verify if the article page is open")
    public void verifyArticlePageDisplayed() {
        String searchInput = MainPageSteps.getSearchInput();
        Assert.assertTrue(articlePage.getHeaderText().contains(searchInput), "Article Page header does not contain the search input: " + searchInput);
    }
}
