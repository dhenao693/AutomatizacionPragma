package co.com.pragma.web.demoblaze.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static co.com.pragma.web.demoblaze.utils.Constants.URL_HOME;

@DefaultUrl(URL_HOME)
public class DemoblazeHomePage extends PageObject {
    public static final Target BTN_LOG_IN = Target.the("")
            .located(By.id("login2"));
    public static final Target BTN_SING_UP = Target.the("")
            .located(By.id("login2"));
    public static final Target BTN_FIRST_PRODUCT = Target.the("")
            .located(By.xpath("(//div[@id='tbodyid']/div//a[@href]/img)[1]"));
    public static final Target LBL_NAME_USER = Target.the("")
            .located(By.id("nameofuser"));

}