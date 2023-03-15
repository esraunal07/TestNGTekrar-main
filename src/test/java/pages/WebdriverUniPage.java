package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class WebdriverUniPage {

   public WebdriverUniPage(){
       PageFactory.initElements(Driver.getDriver(),this);
}

        @FindBy(xpath = "//iframe[@id='frame']")
        public WebElement frame;

        @FindBy (linkText = "Our Products")
        public WebElement ourProducts;

         @FindBy (xpath = "//div[@id='cameras']")
        public WebElement cameras;

        @FindBy (xpath ="//div[@class='modal-body']")
        public WebElement popUpMesaj ;

        @FindBy (xpath = "//button[text()='Close']")
        public WebElement popUpClose;

        @FindBy (xpath = "//a[@id='nav-title'])[1]")
        public WebElement iframeLinkiElementi;

    echo "# TestNGTekrar-main" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/esraunal07/TestNGTekrar-main.git
    git push -u origin main

}
