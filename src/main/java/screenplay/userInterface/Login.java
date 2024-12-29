package screenplay.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    private Login(){}

    public static final By SHDHOST_USUARIO = By.id("username");
    public static final By USUARIO = By.cssSelector("input[name='username-input']");
    public static final By SHDHOST_PASSWORD = By.id("current-password");
    public static final By PASSWORD = By.cssSelector("input[name='password-input']");
    public static final Target INGRESAR = Target.the("Boton Ingresar").locatedBy("[id='login-submit']");
}
