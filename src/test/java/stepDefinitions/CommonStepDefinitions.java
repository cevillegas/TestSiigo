package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screenplay.tasks.AbrirLaWeb;
import screenplay.tasks.HacerLogin;
import screenplay.tasks.NavegarA;

import static stepDefinitions.Hook.actor;


public class CommonStepDefinitions {

    @Given("que el usuario de Siigo desea iniciar sesion con {string} {string}")
    public void hacerLogin(String usuario, String password) {
        actor.attemptsTo(AbrirLaWeb.de("https://qastaging.siigo.com/#/login"));
        actor.attemptsTo(HacerLogin.conCredenciales(usuario,password));
    }

    @And("navega a la seccion de creacion de clientes")
    public void navegarACreacionDeClientes() {
        actor.attemptsTo(NavegarA.creacionDeCliente());
    }

    @When("realiza el proceso para crear un cliente")
    public void crearCliente() {

    }

    @Then("visualiza el mensaje de creacion exitosa del cliente")
    public void validarCreacionExitosa() {

    }
}
