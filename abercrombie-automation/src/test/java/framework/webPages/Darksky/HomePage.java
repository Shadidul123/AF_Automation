package framework.webPages.Darksky;

import framework.webPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public class HomePage extends BasePage {

    private final By darkSkyAPILink = By.linkText("Dark Sky API");
    private final By todaysTimeline = By.xpath("//a[@data-day='0']//span[@class='open']");
    private final By tempsOnTodaysTimeline = By.xpath("//a[@data-day='0']//span[contains(@class,'Temp')]");
    private final By tempsInTodaysTimeline = By.xpath("//div[@class='dayDetails revealed']//span[@class='temp']");
    private final By timesOnTimeline = By.xpath("//div[@class='hours']//span//span");
    private final By tempsOnTimeline = By.xpath("//div[@class='temps']//span//span");
    private final By currentTemp = By.xpath("//span[@class='summary swap']");

    }
