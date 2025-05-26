package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ArticlePage extends Form {
    private final IButton pageToolsDropdown = getElementFactory().getButton(By.xpath("//div[contains(@id, 'page-tools-dropdown')]"), "Page Tools Dropdown");
    private final IButton downloadAsPdfButton = getElementFactory().getButton(By.xpath("//li[contains(@id, 'download-as-rl')]"), "Download as PDF");
    private final IButton pageInformationButton = getElementFactory().getButton(By.xpath("//li[@id='t-info']"), "Page Information");
    private final ILabel articlePageTitle = getElementFactory().getLabel(By.xpath("//span[contains(@class, 'title-main')]"), "Article Page Title");

    public ArticlePage() {
        super(By.xpath("//div[@id='siteSub']"), "Article Page");
    }

    @Step("Navigate to Download as PDF page")
    public void downloadAsPDF() {
        pageToolsDropdown.click();
        downloadAsPdfButton.click();
    }

    @Step("Navigate to Page Information page")
    public void navigateToPageInformation() {
        pageToolsDropdown.click();
        pageInformationButton.click();
    }

    @Step("Getting text from header for assertion")
    public String getHeaderText() {
        return articlePageTitle.getText();
    }
}
