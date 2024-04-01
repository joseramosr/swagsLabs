package co.com.accenture.certificacion.swagslabs.stepdefinitions;

import co.com.accenture.certificacion.swagslabs.exceptions.FailedPurchase;
import co.com.accenture.certificacion.swagslabs.tasks.AddProducts;
import co.com.accenture.certificacion.swagslabs.tasks.PayProducts;
import co.com.accenture.certificacion.swagslabs.tasks.SingIn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.questions.Visibility;

import java.util.List;
import java.util.Map;

import static co.com.accenture.certificacion.swagslabs.exceptions.FailedPurchase.FAILED_PURCHASE_ERROR;
import static co.com.accenture.certificacion.swagslabs.models.builders.CheckoutInformationBuilder.enteringTheFirstName;
import static co.com.accenture.certificacion.swagslabs.userinterfaces.CheckoutCompletePage.TITLE_CHECKOUT_COMPLETE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BuyingProductsStepDefinition {

    @Given("that {word} logged into the SwagLabs app")
    public void thatAnalystLoggedIntoTheSwagLabsApp(String actorName) {
        theActorCalled(actorName).wasAbleTo(SingIn.toSwagsLabsApp());
    }

    @When("he adds products to the cart")
    public void heAddsProductsToTheCart(List<Map<String, String>> products) {
        theActorInTheSpotlight().attemptsTo(AddProducts.toTheCart(products));
    }

    @And("he checks out his purchase")
    public void heChecksOutHisPurchase() {
        theActorInTheSpotlight().attemptsTo(
                PayProducts.onTheCart(enteringTheFirstName("Jose")
                        .enteringLastName("Ramos").enteringZipCode("050005").build())
        );
    }

    @Then("he should see the successful purchase message")
    public void heShouldSeeTheSuccessfulPurchaseMessage() {
        theActorInTheSpotlight().should(
                seeThat(Visibility.of(TITLE_CHECKOUT_COMPLETE))
                        .orComplainWith(FailedPurchase.class, FAILED_PURCHASE_ERROR)
        );
    }
}