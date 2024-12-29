package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarCreacion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        //Validar mensaje de creacion exitosa y retornar respuesta
        return null;
    }

    public static ValidarCreacion deCliente(){
        return new ValidarCreacion();
    }
}
