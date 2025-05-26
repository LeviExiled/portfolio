package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.DownloadPDFPage;
import aquality.selenium.browser.AqualityServices;

import java.nio.file.Files;
import java.nio.file.Paths;

public class DownloadPDFSteps {
    private final DownloadPDFPage downloadPDFPage = new DownloadPDFPage();

    @Then("I download the article as a PDF")
    public void downloadArticleAsPDF() {
        String fileName = downloadPDFPage.getFileName();
        String downloadsPath = AqualityServices.getBrowser().getDownloadDirectory();
        downloadPDFPage.downloadFile();
        boolean isFileDownloaded = AqualityServices.getConditionalWait().waitFor(() ->
                Files.exists(Paths.get(downloadsPath, fileName)));
        Assert.assertTrue(isFileDownloaded, "File was not downloaded.");
    }
}
