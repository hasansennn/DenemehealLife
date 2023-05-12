package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAdminDashboard extends Base {

    //!!!!!!!!! KOD YAZMADAN ÖNCE KENDİ BRANCH'İNDE OLDUĞUNDAN EMİN OL !!!!!!!!!!!!!!!!!!!!
    //!!!!!!!!! KOD YAZMADAN ÖNCE KENDİ BRANCH'İNDE OLDUĞUNDAN EMİN OL !!!!!!!!!!!!!!!!!!!!
    //!!!!!!!!! KOD YAZMADAN ÖNCE KENDİ BRANCH'İNDE OLDUĞUNDAN EMİN OL !!!!!!!!!!!!!!!!!!!!

    //!!!!!!!! MAİN BRANCH'DE YAPACAĞIMIZ TEK İŞLEM PULL ETMEK !!!!!!!!!!!!!!!
    //!!!!!!!! MAİN BRANCH'DE YAPACAĞIMIZ TEK İŞLEM PULL ETMEK !!!!!!!!!!!!!!!
    //!!!!!!!! MAİN BRANCH'DE YAPACAĞIMIZ TEK İŞLEM PULL ETMEK !!!!!!!!!!!!!!!


   /*
    ### Isimlendirmelerde dikaat edilecekler
***
        | Element Türü   | Variable name |
            |----------------|---------------|
            | Bilgi girsi    | fieledEmail   |
            | Button         | buttonLogout  |
            | Logo           | logoX         |
            | icon           | iconX         |
            | Sadece text    | labelX        |
            | Drop down      | dropDownX     |
            | Radio Button   | radioButtonX  |
            | Check box      | checkBoxX     |
            | Tablo Sütünu   | columnX       |
            | Tablo Satiri   | rowX          |
            | Kisi Resimleri | imageProfileX |
            | ürün resimleri | imageProductX |
            | Linkler        | linkX         |
            | TextBox        | textBoxXYZ    |

*/

    //!!!!!!!!!!!!!!!!!!  ADMİN Navbar    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    //Admin/Navbar/healLIFE
    @FindBy(xpath = "//span[@class='logo-lg']")
    public WebElement logoHealLife;

    //Admin/Navbar/Button
    @FindBy(xpath = "//a[@role='button']")
    public WebElement buttonMenu;

    //Admin/Navbar/Image
    @FindBy(xpath = "//img[@height='19']")
    public WebElement imageMenu;

    //Admin/Navbar/Text
    @FindBy(xpath = "//span[@class='sidebar-session']")
    public WebElement textBoxHeallife;

    //Admin/Navbar/Search
    @FindBy(xpath = "//input[@type='text']")
    public WebElement iconSearch;


}