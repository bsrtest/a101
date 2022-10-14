package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101PageClass {
    public A101PageClass() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[text()='Kabul Et']")
    public WebElement cookies;

    @FindBy(xpath = "(//*[@title='GİYİM & AKSESUAR'])[1]")
    public WebElement giyimAksesuar;

    @FindBy(xpath = "//*[text()='Dizaltı Çorap']")
    public WebElement dizaltıCorap;

    @FindBy(xpath = "(//*[@class='name-price'])[1]")
    public WebElement siyahCorap;

    @FindBy(xpath = "//h1[text()='Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
    public WebElement urunRengi;

    @FindBy(xpath = "//*[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "(//a[text()='Sepeti Görüntüle'])[2]")
    public WebElement sepetiGoruntule;

    @FindBy(xpath = "//*[@class='button green checkout-button block js-checkout-button']")
    public WebElement sepetiOnayla;

    @FindBy(xpath = "//*[@class='auth__form__proceed js-proceed-to-checkout-btn']")
    public WebElement uyeOlmadanDevamEt;

    @FindBy(xpath = "//input[@name='user_email']")
    public WebElement userEmail;

    @FindBy(xpath = "(//a[@title='Yeni adres oluştur'])[1]")
    public WebElement yeniAdresButonu;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement adresBasligi;

    @FindBy(xpath = "//*[@name='city']")
    public WebElement sehir;

    @FindBy(xpath = "//select[@name='township']")
    public WebElement ilce;

    @FindBy(xpath = "//select[@name='district']")
    public WebElement mahalle;

    @FindBy(xpath = "//*[@class='js-address-textarea']")
    public WebElement adresButonu;

    @FindBy(xpath = "//*[@class='button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button']")
    public WebElement kaydetButonu;

    @FindBy(xpath = "(//form//button[@type='submit'])[1]")
    public WebElement kaydetveDevamEt;

   @FindBy(css = ".page-checkout.js-page-checkout.js-tab-box")
    public WebElement odemeEkrani;
}

