package screenplay.interactions;

import net.serenitybdd.core.Serenity;
import org.openqa.selenium.*;

public class ShadowRoot {
    private static WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
    public ShadowRoot(){
    }

    public static void shadowRootTextoNivelDos(By padre, By selector, String dato){
        WebElement shadowHost = driver.findElement(padre);
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        WebElement elemento = shadowRoot.findElement(selector);
        elemento.click();
        elemento.sendKeys(dato);
    }

    public static void shadowRootClickNivelDos(By padre, By selector){
        WebElement shadowHost = driver.findElement(padre);
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        WebElement elemento = shadowRoot.findElement(selector);
        elemento.click();
    }

    public static void ShadowRootClickNivelTres(By padre, By hijo, By selector){
        WebElement shadowHost = driver.findElement(padre);
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        WebElement shrHijo = shadowRoot.findElement(hijo);
        SearchContext shadowRoot1 = shrHijo.getShadowRoot();

        WebElement elementoClicleable = shadowRoot1.findElement(selector);
        elementoClicleable.click();
    }

}
