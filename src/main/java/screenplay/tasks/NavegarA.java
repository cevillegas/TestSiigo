package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.interactions.ShadowRoot;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static screenplay.userInterface.MenuOpciones.*;

public class NavegarA implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SHDHOST_CREAR, isCurrentlyVisible()).forNoMoreThan(60).seconds()
        );
        ShadowRoot.ShadowRootClickNivelTres(SHDHOST_CREAR,SHD_CREAR,BOTON_CREAR);
        ShadowRoot.shadowRootClickNivelDos(SHDHOST_CREAR,OPCION_CLIENTES);
    }

    public static NavegarA creacionDeCliente(){
        return instrumented(NavegarA.class);
    }
}
