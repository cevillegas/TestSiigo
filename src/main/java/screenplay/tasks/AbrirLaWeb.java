package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirLaWeb implements Task {
    private String url;

    public AbrirLaWeb(String url){
        this.url = url;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }

    public static AbrirLaWeb de(String url){
        return instrumented(AbrirLaWeb.class,url);
    }

}
