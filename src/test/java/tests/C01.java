package tests;

import org.testng.annotations.Test;
import pages.WebdriverUniPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01 {
    WebdriverUniPage webdriverUniPage=new WebdriverUniPage() ;

    @Test
    public void WebdriverUniTest() throws InterruptedException {

        WebdriverUniPage webdriverUniPage = new WebdriverUniPage();
        Driver.getDriver().get(ConfigReader.getProperty("webUrl"));

        Thread.sleep(2000);

        Driver.getDriver().switchTo().frame(webdriverUniPage.frame);

        webdriverUniPage.ourProducts.click();

        webdriverUniPage.cameras.click();

        System.out.println(webdriverUniPage.popUpMesaj.getText());

        webdriverUniPage.popUpClose.click();

        webdriverUniPage.iframeLinkiElementi.click();

          /*
        2. “Our Products” butonuna basin
        3. “Cameras product”i tiklayin
        4. Popup mesajini yazdirin
        5. “close” butonuna basin
        6. "WebdriverUniversity.com (IFrame)" linkini tiklayin
        */

     }
}
