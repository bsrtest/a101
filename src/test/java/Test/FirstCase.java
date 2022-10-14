package Test;

import Page.A101PageClass;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class FirstCase {

    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get("https://www.a101.com.tr/"); // A101 sayfasina gidilir.

        A101PageClass a101PageClass = new A101PageClass();

        a101PageClass.cookies.click();//Cookies kabul edildi.

        Driver.actions().moveToElement(a101PageClass.giyimAksesuar).perform();//giyim ve aksesuar bolumunun ustune gelinir

        a101PageClass.dizaltıCorap.click();//dizalti corap bolumune tiklanir

        a101PageClass.siyahCorap.click();//ilk siyah urune tiklanir

        String expectedColor="Siyah";//secilen urunun siyah renk oldugu dogrulanir.
        Assert.assertTrue(a101PageClass.urunRengi.getText().contains(expectedColor));

        a101PageClass.sepeteEkle.click();//urun sepete eklendi.

        a101PageClass.sepetiGoruntule.click();//sepeti goruntule butonu tiklanir.

        a101PageClass.sepetiOnayla.click();//sepeti onayla tiklanir

        a101PageClass.uyeOlmadanDevamEt.click();//uye olmadan devam onayla tiklanir

        a101PageClass.userEmail.sendKeys("bturk@gmail.com", Keys.ENTER);//email bilgisi girilir

        a101PageClass.yeniAdresButonu.click();//yeni adres butonuna tiklariz.

        Driver.actions().click(a101PageClass.adresBasligi).sendKeys("Ev Adresi").sendKeys(Keys.TAB)//adres basli[i girilir
                .sendKeys("Busra").sendKeys(Keys.TAB)//isim bilgisi girilir
                .sendKeys("Cokyasar").sendKeys(Keys.TAB)//soyisim bilgisi girilir
                .sendKeys("5412445775").sendKeys(Keys.TAB)//telefon bilgiisi girilir
                .sendKeys(Keys.ENTER).perform();//sehir butonuna tiklanir

        Driver.select(a101PageClass.sehir).selectByValue("7");//sehir olarak Ankara secilir
        Thread.sleep(2000);

        Driver.select(a101PageClass.ilce).selectByVisibleText("KEÇİÖREN");//ilce secimi yapildi
        Thread.sleep(2000);

        Driver.select(a101PageClass.mahalle).selectByVisibleText("AYVALI MAH");//mahalle secimi yapildi
        Thread.sleep(2000);

        a101PageClass.adresButonu.sendKeys("Hale sok. No:12/5");//adres bilgileri girildi
        Thread.sleep(4000);

        a101PageClass.kaydetButonu.click();//Kaydet butonuna tiklanir
        Thread.sleep(2000);
        a101PageClass.kaydetveDevamEt.submit();// //Kaydet ve devam et butonuna tiklanir

        Assert.assertTrue(a101PageClass.odemeEkrani.isDisplayed());//odeme ekranina basarili bir sekilde gecildigi dogrulanir.

        Driver.closeDriver();




    }
}
