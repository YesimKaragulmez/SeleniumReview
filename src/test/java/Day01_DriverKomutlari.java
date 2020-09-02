import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day01_DriverKomutlari {
    @Test
    public void test1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driveri tam ekran yaptik
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://google.com");
        //herhangi bir web sayfasina gider
        driver.navigate().to("http://amazon.com");
        //bir onceki sayfaya geri git
        driver.navigate().back();


        //ileri gider
        driver.navigate().forward();
        //sayfayi yeniler
        driver.navigate().refresh();
        //drveri kapatmak icin kullanilir
        driver.quit();

        //acik olan sekmeyi kapatmak icin
        driver.close();


    }


}
