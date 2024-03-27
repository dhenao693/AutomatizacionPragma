package co.com.pragma.web.demoblaze.tasks;

import co.com.pragma.web.demoblaze.models.User;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.pragma.web.demoblaze.userinterfaces.DemoblazeHomePage.BTN_LOG_IN;
import static co.com.pragma.web.demoblaze.userinterfaces.login.LoginModalPage.BTN_START_LOGIN;
import static co.com.pragma.web.demoblaze.userinterfaces.login.LoginModalPage.LBL_PASSSWORD;
import static co.com.pragma.web.demoblaze.userinterfaces.login.LoginModalPage.LBL_USER;
import static co.com.pragma.web.demoblaze.utils.Constants.USER_IN_MEMORY;
import static co.com.pragma.web.demoblaze.utils.ConvertMapToModel.convertMapToUser;

@AllArgsConstructor
public class Login implements Task {
    private User user;

    public static Login withTheUser(List<Map<String, String>> users) {
        return Tasks.instrumented(Login.class, convertMapToUser(users.get(0)));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(USER_IN_MEMORY, user);
        actor.attemptsTo(
                Click.on(BTN_LOG_IN),
                Enter.theValue(user.getUsername()).into(LBL_USER),
                Enter.theValue(user.getPassword()).into(LBL_PASSSWORD),
                Click.on(BTN_START_LOGIN)
        );
    }
}
