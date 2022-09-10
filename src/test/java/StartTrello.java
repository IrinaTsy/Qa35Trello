import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartTrello {

        WebDriver wd;

        @Test
        public void trello(){

            wd = new ChromeDriver();
            // or System.setProperty("webdriver","..../Downloads/chromedriver.exe"); --> драйвер должен быть распакован в папку Downlaods

            wd.navigate().to("https://trello.com/");
            wd.navigate().back();
            wd.navigate().forward();
            wd.navigate().refresh();
            wd.quit();

        }
}
