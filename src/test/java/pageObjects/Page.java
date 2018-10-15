package pageObjects;

import listener.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {
    private WebDriver driver = Browser.getDriver();
    public CustomTrouserPage customDriverPage = PageFactory.initElements(driver, CustomTrouserPage.class);
}
