package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class DownloadPDFPage extends Form {
    private final IButton downloadPDFButton = getElementFactory().getButton(By.xpath("//button[@type='submit']"), "Download PDF Button");
    private final ILabel nameOfPdfFile = getElementFactory().getLabel(By.xpath("//div[contains(@class, 'label-desc')]"), "File Name of PDF");

    public DownloadPDFPage() {
        super(By.xpath("//button[contains(@class, 'buttonElement')]"), "Download PDF Page");
    }

    @Step("Get PDF file name")
    public String getFileName() {
        return nameOfPdfFile.getText();
    }

    @Step("Click Download button")
    public void downloadFile() {
        downloadPDFButton.click();
    }
}
