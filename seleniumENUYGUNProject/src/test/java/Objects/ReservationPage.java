package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReservationPage {

    WebDriver driver;
    By payPageText = By.xpath("//span[text()='Bilgilerini Gir']");

    public ReservationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getPageText(){
            System.out.println("This Page is : "+driver.findElement(payPageText).getText());
    }
}

