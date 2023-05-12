package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

public class PageHomepage extends Base{
    WebDriver driver= Driver.getDriver();
    @FindBy(xpath = "//*[@class='navbar-brand logo']")
    public WebElement logoHospitalSite;

    @FindBy(xpath = "//*[@class='col-md-9 col-sm-12']")
    public WebElement sliderLastestNews;

    @FindBy(xpath = "//*[@class='collapse navbar-collapse']")
    public WebElement buttonsNavbarElements;

    @FindBy(xpath = "(//a[text()='Home'])[1]")
    public WebElement buttonHomeLink;

    @FindBy(xpath = "//*[text()='Appointment']")
    public WebElement linkAppointmentPage;

    @FindBy(xpath = "(//*[text()='Gallery'])[1]")
    public WebElement linkGalleryPage;

    @FindBy(xpath = "(//*[text()='Contact Us'])[1]")
    public WebElement linkContactusPage;



    public  void urlQuery(String expUrlContent,String actUrl){
        actUrl=driver.getCurrentUrl();

        Assert.assertTrue(actUrl.contains(expUrlContent));

    }
    public void elementIsDisplayed(WebElement elementName){
        Assert.assertTrue(elementName.isDisplayed());
    }
    public void elementIsSelected(WebElement elementName){
        Assert.assertTrue(elementName.isSelected());
    }

    public void elementIsEnabled(WebElement elementName){
        Assert.assertTrue(elementName.isEnabled());
    }

    public void selectInDropDown(WebElement elementName,String selectedText, String expUrlContent,String actUrl){
        elementName.click();
        ReusableMethod.bekle(1);
        Select select=new Select(elementName);
        select.selectByVisibleText(selectedText);
        ReusableMethod.bekle(1);
        actUrl=driver.getCurrentUrl();
        urlQuery(expUrlContent,actUrl);

    }

    public void goToUrl(String url){

        driver.get(ConfigReader.getProperty(url));

    }
    public void clickAndUrlQuery(WebElement element,String expUrlContent,String actUrl){
        element.click();
        actUrl=Driver.getDriver().getCurrentUrl();
        urlQuery(expUrlContent,actUrl);
        ReusableMethod.bekle(1);



    }
}
