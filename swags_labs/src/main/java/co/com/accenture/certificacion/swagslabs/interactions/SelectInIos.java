package co.com.accenture.certificacion.swagslabs.interactions;

import co.com.accenture.certificacion.swagslabs.utils.ScrollToElement;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectInIos implements Interaction {
    private final By locator;
    private final String text;
    private final String attribute;

    public SelectInIos(By locator, String text, String attribute) {
        this.locator = locator;
        this.text = text;
        this.attribute = attribute;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean elementFound = false;
        int maxTries = 0;
        WebDriver driver = Serenity.getDriver();
        while (!elementFound && maxTries < 10) {
            if (driver.findElement(locator).isDisplayed()) {
                driver.findElement(locator).click();
                elementFound = true;
            } else {
                ScrollToElement.withArguments(attribute, text);
                maxTries++;
            }
        }
    }

    public static Performable theElementWith(By locator, String text, String attribute) {
        return instrumented(SelectInIos.class, locator, text, attribute);
    }
}
