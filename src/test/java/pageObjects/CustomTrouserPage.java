package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.PriorityQueue;

public class CustomTrouserPage {
    private final WebDriver driver;
    private WebDriverWait wait;

    public CustomTrouserPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 1500);
    }

    @FindBy(how = How.XPATH, using = "//div[text()=\"Custom made trousers\"]")
    public WebElement customTrouserHeader;

    @FindBy(how = How.XPATH, using = "(//button[contains(text(),\"Add To Bag\")])[2]")
    public WebElement addToBagButton;

    @FindBy(how=How.CSS,using = "div[class=\"slide-panel--a__content\"]")
    public WebElement slidePanel;

    @FindBy(how = How.CSS, using = "div[class=\"shopping-bag__inner-wrap js-shopping-bag__inner-wrap\"]")
    public WebElement bucket;

    public void selectFabric(String fabric) {
        WebElement fabricElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-item-name=\"" + fabric + "\"]")));
        fabricElement.click();
    }

    public void selectFit(String fit) {
        WebElement fitElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-item-name=\"" + fit + "\"]")));
        fitElement.click();
    }

    public void selectTurnUp(String turnUp) {
        WebElement turnUpElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-item-name=\"" + turnUp + "\"]")));
        turnUpElement.click();
    }

    public void selectWaistBand(String waistBand) {
        WebElement waistBandElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-item-name=\"" + waistBand + "\"]")));
        waistBandElement.click();
    }

    public void selectBelt(String belt) {
        WebElement beltElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[data-item-name=\"" + belt + "\"]")));
        beltElement.click();
    }

    public void selectSize(String size) {
        System.out.println("//div[@class=\"checkbox\"]/label[contains(text(),\""+size+"\")]");
        WebElement sizeElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"checkbox\"]/label[contains(text(),\""+size+"\")]")));
        sizeElement.click();
    }

}
