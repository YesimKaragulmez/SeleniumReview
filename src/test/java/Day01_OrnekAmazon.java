import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day01_OrnekAmazon {
    // 1. Amazon.com'a gideceğiz.
// 2. Arama kutusuna "baby stroller"
// 3. 2. Sıradaki ürüne tıklayacağız.
// 4. Ürün sayfasına gittikten sonra, ürünün toplam fiyatını alacağız.
// 5. Ürünün ortalama puanını (5 üzerinden) alacağız.
    @Test
    public void test() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://Amazon.com");
        WebElement textBox = driver.findElement(By.id("twotabsearchtextbox"));
        textBox.sendKeys("baby stroller");
        textBox.submit();
        WebElement secondBabyStroller = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
        secondBabyStroller.click();
        WebElement price = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
        System.out.println(price.getText());
        WebElement yildiz = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-star a-star-4-5'])[1]"));
        System.out.println(yildiz.getText());

    }

    @Test
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://Amazon.com");
        driver.navigate().to("http://Google.com");
        WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
        textBox.sendKeys("kemal ozden");
        textBox.submit();
        driver.findElement(By.xpath("//div[@id='result-stats']")).getText();

    }


    }
//    public class Day01_OrnekAmazon {
//        // 1. Amazon.com'a gideceğiz.
//        // 2. Arama kutusuna "baby stroller"
//        // 3. 2. Sıradaki ürüne tıklayacağız.
//        // 4. Ürün sayfasına gittikten sonra, ürünün toplam fiyatını alacağız.
//        // 5. Ürünün ortalama puanını (5 üzerinden) alacağız.
//        WebDriver driver;
//        @Test
//        public void test1(){
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.get("http://amazon.com");
//            WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
//            aramaKutusu.sendKeys("baby stroller" + Keys.ENTER );
//            WebElement ikinciSiradaUrun = driver.findElement(By.xpath("( //a[@class='a-link-normal a-text-normal'] )[2]"));
//            ikinciSiradaUrun.click();
//            WebElement urunFiyati = driver.findElement(By.id("priceblock_ourprice_row"));
//            System.out.println(urunFiyati.getText());
//            ////////////////////////////////
//            driver.navigate().to("http://google.com");
//            WebElement googleAramaKutusu = driver.findElement(By.name("q"));
//            googleAramaKutusu.sendKeys("Kemal Ozden");
//            googleAramaKutusu.submit();
//            WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
//            System.out.println(sonucSayisi.getText());
//        }
//    }


