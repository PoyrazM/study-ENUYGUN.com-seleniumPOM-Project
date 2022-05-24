package Tests;

import Objects.HomePage;
import Objects.ReservationPage;
import Objects.TicketSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

public class BaseTest{

    WebDriverManager manager;
    String baseUrl = "https://www.enuygun.com/" ;
    EdgeOptions edgeOptions;
    WebDriver driver;
    HomePage home ;
    TicketSearchPage ticket ;
    ReservationPage reservationPage;


    @BeforeTest
    public void setUpDriver(){
        edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--disable-notifications");
        manager.edgedriver().setup();
        driver = new EdgeDriver(edgeOptions);
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    @Test(priority = 1)
    public void departureSelect(){
        home = new HomePage(driver);
        home.selectDeparture("İzmir");
    }

    @Test(priority = 2)
    public void definitionSelect(){
        home.selectDefinition("İstanbul");
    }
    @Test(priority = 3)
    public void dateSelect(){
        home.selectDate();
    }
    @Test(priority = 4)
    public void clickFindButton(){
        home.clickButton();
    }

    @Test(priority = 5)
    public void clickTicketButton(){
        ticket = new TicketSearchPage(driver);
        ticket.ticketFind();
    }

    @Test(priority = 6)
    public void getPayPageText(){
        reservationPage = new ReservationPage(driver);
        reservationPage.getPageText();
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}



