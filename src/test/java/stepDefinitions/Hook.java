package stepDefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Hook {
    @Managed(driver = "chrome")
    WebDriver hisBrowser;
    public static Actor actor = Actor.named("Cesar");

    @Before
    public void set_the_stage() {
        actor.can(BrowseTheWeb.with(hisBrowser));
    }
}
