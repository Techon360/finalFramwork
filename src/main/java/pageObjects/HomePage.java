package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public  HomePage(WebDriver ldriver)
    {
        this.driver=ldriver;
        PageFactory.initElements(driver, this);
    }


    // click Home menu

    @FindBy(xpath="//ul[@class='nav']//child::li[1]") public WebElement menu_home;

    public void click_menu_home()
    {  
       menu_home.click();
       }
// fetch patient id of first row
    @FindBy(xpath="//table/tr[2]/td[3]/div") public WebElement patientidoffirstrow;

    public String getpatientidoffirstrow()
    {
       return patientidoffirstrow.getText();
    }
}
