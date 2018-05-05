package GooglePages;

import SeleniumUtilities.TestManager;
import PageUtilities.pageInitializer;
import org.openqa.selenium.By;

public class Results extends pageInitializer {

    public Results(TestManager manager) throws Exception{
        super(manager);
    }

    public void tapOnImages(){
        manager.seleniumDriver.findElement(By.xpath(pageObjects.get("imagesResults"))).click();
    }
}
