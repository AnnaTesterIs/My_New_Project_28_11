import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.net.URL;
public class OpenGoogle {
    WebDriver wd;
    @Test
    public void test(){
       wd = new ChromeDriver();
        wd.navigate().to("https://mail.google.com/");


    }


}
