package co.com.pragma.web.demoblaze.stepdefinitions;

import co.com.pragma.web.demoblaze.models.User;
import co.com.pragma.web.demoblaze.questions.ValidateLogin;
import co.com.pragma.web.demoblaze.tasks.Login;
import co.com.pragma.web.demoblaze.utils.Constants;
import co.com.pragma.web.demoblaze.utils.ConvertText;
import co.com.pragma.web.demoblaze.utils.ValidateMessage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static co.com.pragma.web.demoblaze.utils.Constants.USER_IN_MEMORY;
import static co.com.pragma.web.demoblaze.utils.ConvertText.convertUsernameLogged;
import static org.hamcrest.Matchers.equalTo;


import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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
}
