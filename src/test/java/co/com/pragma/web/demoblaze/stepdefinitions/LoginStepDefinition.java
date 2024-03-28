package co.com.pragma.web.demoblaze.stepdefinitions;

import co.com.pragma.web.demoblaze.questions.ValidateLogin;
import co.com.pragma.web.demoblaze.tasks.Login;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static co.com.pragma.web.demoblaze.utils.ConvertText.convertUsernameLogged;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinition {
    @When("login in app")
    public void loginInApp(List<Map<String, String>> users) {
        theActorInTheSpotlight().attemptsTo(Login.withTheUser(users));
    }

    @Then("see the correct username")
    public void seeTheCorrectUsername() {
        theActorInTheSpotlight().should(seeThat(ValidateLogin.inScreen(),
                equalTo(convertUsernameLogged(theActorInTheSpotlight()))));
    }


    @When("login in app without username")
    public void loginInAppWithoutUsername(List<Map<String, String>> users) {
        theActorInTheSpotlight().attemptsTo(Login.withTheUser(users).withoutUser());
    }

    @When("login in app without password")
    public void loginInAppWithoutPassword(List<Map<String, String>> users) {
        theActorInTheSpotlight().attemptsTo(Login.withTheUser(users).withoutPassword());
    }

    @When("login in app without all")
    public void loginInAppWithoutAll(List<Map<String, String>> users) {
        theActorInTheSpotlight().attemptsTo(Login.withTheUser(users).withoutUser().withoutPassword());
    }
}
