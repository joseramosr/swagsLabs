package co.com.accenture.certificacion.swagslabs.utils;

import net.serenitybdd.core.Serenity;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class ScrollToElement {

    private  ScrollToElement() {throw new IllegalStateException("Utility class");}

    public static void withArguments(String attribute, String text) {
        WebDriver driver = Serenity.getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put(attribute, text);
        js.executeScript("mobile:scroll", scrollObject);
    }


}

