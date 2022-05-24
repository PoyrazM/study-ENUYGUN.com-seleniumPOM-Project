package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    By departureTxt = By.id("OriginInput") ;
    By departureItem = By.className("suggestion_item");
    By definitionTxt = By.id("DestinationInput");
    By definitionItem = By.className("suggestion_item");
    By datePicker = By.id("DepartureDate");
    By dateSelect = By.xpath("(//tr//td)[89]");
    By findButton = By.xpath("//button[@class='primary-btn block']");

    public HomePage(WebDriver driver){
        this.driver = driver ;
    }

    public void selectDeparture(String city){
        driver.findElement(departureTxt).sendKeys(city);
        driver.findElement(departureItem).click();
    }

    public void selectDefinition(String city){
        driver.findElement(definitionTxt).sendKeys(city);
        driver.findElement(definitionItem).click();
    }

    public void selectDate(){
        driver.findElement(datePicker).click();
        driver.findElement(dateSelect).click();
    }

    public void clickButton(){
        driver.findElement(findButton).click();
    }
}

