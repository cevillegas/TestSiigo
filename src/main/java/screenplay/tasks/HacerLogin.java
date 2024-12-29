package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.interactions.ShadowRoot;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static screenplay.userInterface.Login.*;

public class HacerLogin implements Task {
    private String usuario;
    private String password;

    public HacerLogin(String usuario, String password){
        this.usuario = usuario;
        this.password = password;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INGRESAR, isPresent()).forNoMoreThan(60).seconds()
        );
        ShadowRoot.shadowRootTextoNivelDos(SHDHOST_USUARIO,USUARIO,usuario);
        ShadowRoot.shadowRootTextoNivelDos(SHDHOST_PASSWORD,PASSWORD,password);
        actor.attemptsTo(Click.on(INGRESAR));
    }

    public static HacerLogin conCredenciales(String usuario, String password){
        return instrumented(HacerLogin.class,usuario,password);

    }
}
