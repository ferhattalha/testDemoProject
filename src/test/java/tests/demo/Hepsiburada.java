package tests.demo;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HepsiburadaPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class Hepsiburada extends TestBase {



    @Test

    public void Test(){
        driver.get(ConfigReader.getProperty("HBUrl"));
        HepsiburadaPage hepsiburadaPage=new HepsiburadaPage(driver);
        hepsiburadaPage.aramaKutusu.sendKeys(ConfigReader.getProperty("hepsiburadaArananKelime"));

        hepsiburadaPage.aramaKutusu.click();
       

    }
}
