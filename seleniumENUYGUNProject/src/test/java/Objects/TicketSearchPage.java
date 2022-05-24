package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TicketSearchPage {

    WebDriver driver;
    JavascriptExecutor jse ;
    WebDriverWait wait;
    By selectButtonTicket = By.xpath("(//button//span//i)[9]");
    By selectAndForward = By.xpath("(//div//i)[88]");

    public TicketSearchPage(WebDriver driver){
        this.driver = driver ;
    }

    public void ticketFind() {
        jse = (JavascriptExecutor) driver ;
        jse.executeScript("window.scrollBy(0,650)","");
        driver.findElement(selectButtonTicket).click();
        driver.findElement(selectAndForward).click();
    }
}
