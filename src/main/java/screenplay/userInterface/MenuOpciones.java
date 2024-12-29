package screenplay.userInterface;

import org.openqa.selenium.By;

public class MenuOpciones {
    private MenuOpciones(){}

    public static final By SHDHOST_CREAR= By.cssSelector("siigo-header-molecule.data-siigo-five9.hydrated");
    public static final By SHD_CREAR= By.cssSelector("[data-id='header-create-button']");
    public static final By BOTON_CREAR = By.cssSelector("button.btn-element.size-m");
    public static final By OPCION_CLIENTES = By.cssSelector("a[data-value='Clientes']");
}
