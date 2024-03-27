package co.com.pragma.web.demoblaze.tasks;

import co.com.pragma.web.demoblaze.questions.AddToCarSuccessful;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.pragma.web.demoblaze.userinterfaces.DemoblazeHomePage.BTN_FIRST_PRODUCT;
import static co.com.pragma.web.demoblaze.userinterfaces.ItemPage.BTN_ADD_TO_CARD;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

@AllArgsConstructor
public class AddToCard implements Task {
    private final String alertMessage;

    public static AddToCard withAlertMessage(String alertMessage) {
        return Tasks.instrumented(AddToCard.class, alertMessage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_FIRST_PRODUCT),
                Click.on(BTN_ADD_TO_CARD)
        );
        actor.should(seeThat(AddToCarSuccessful.ok(), equalTo(alertMessage)));
    }
}