package co.com.accenture.certificacion.swagslabs.stepdefinitions;

import co.com.accenture.certificacion.swagslabs.tasks.SingIn;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.accenture.certificacion.swagslabs.userinterfaces.LoginPage.TXT_USERNAME;
import static co.com.accenture.certificacion.swagslabs.userinterfaces.ProductPage.TITLE_PRODUCTS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginStepDefinition {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that the {word} opens the swagsLabs App")
    public void thatTheAnalystOpensTheSwagsLabsApp(String actorName) {
        theActorCalled(actorName).wasAbleTo(WaitUntil.the(TXT_USERNAME,isVisible()).forNoMoreThan(5).seconds());
    }

    @When("he signs in to swagsLabs App")
    public void heSignsInToSwagsLabsApp() {
        theActorInTheSpotlight().attemptsTo(SingIn.toSwagsLabsApp());
    }

    @Then("he should see the title {string}")
    public void heShouldSeeTheTitle(String confirmationTitle) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(TITLE_PRODUCTS).text().contains(confirmationTitle));
    }
}