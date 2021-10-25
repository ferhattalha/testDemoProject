package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HepsiburadaPage {

    WebDriver driver;

    public HepsiburadaPage(WebDriver driver){

        this.driver=driver;

        PageFactory.initElements(driver,this);


    }
    @FindBy(xpath="(//input[@type='text'])[1]")
     public WebElement aramaKutusu;

   @FindBy (xpath="//span[@class='totalCount']")
    public WebElement sonucYazisiElementi;
}
