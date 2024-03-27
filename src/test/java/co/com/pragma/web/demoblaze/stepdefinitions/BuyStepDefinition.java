package co.com.pragma.web.demoblaze.stepdefinitions;

import co.com.pragma.web.demoblaze.questions.AddToCarSuccessful;
import co.com.pragma.web.demoblaze.tasks.AddToCard;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class BuyStepDefinition {
    @When("select first product and add to car with alert {string}")
    public void loginInApp(String alertMessage) {
        theActorInTheSpotlight().attemptsTo(AddToCard.withAlertMessage(alertMessage));
    }

    @Then("see the alert of add to car successful with message {string}")
    public void seeTheAlertOfAddToCarSuccessful(String message) {
        theActorInTheSpotlight().should(seeThat(AddToCarSuccessful.ok(), equalTo(message)));
    }

}
