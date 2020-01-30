package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleWebPage extends PageLocator {

    WebDriver driver;

    PageLocator pageLocator= new PageLocator();

    public SampleWebPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath=loc)
    WebElement textBox;


    public void enterText(){
        //Perform business flow for functionality.
       textBox.sendKeys("anupam");
    }
}
