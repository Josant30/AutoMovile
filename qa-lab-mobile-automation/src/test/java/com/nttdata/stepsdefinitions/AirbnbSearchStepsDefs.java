package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.io.File;

public class AirbnbSearchStepsDefs {

    @Steps
    AirbnbSearchSteps airbnbSearchSteps;

    @Given("que estoy en la aplicación y cierro cualquier ventana emergente")
    public void queEstoyEnLaAplicaciónYCierroCualquierVentanaEmergente() {
        airbnbSearchSteps.clickClose();
    }

    @When("escribo {string} en el formulario {string}")
    public void escriboEnElFormulario(String text1, String text2) {
        System.out.println("Iniciando Formulario");
        Assert.assertEquals(airbnbSearchSteps.getResultText(), text2);
        System.out.println("Comparacion del Where to? Pasado");
        airbnbSearchSteps.searchByText(text1);
        System.out.println("Terminamos el When");
    }

    @And("selecciono {string} en el formulario {string}")
    public void seleccionoEnElFormulario(String form1, String form2) {
        System.out.println("Vamos a comprobar el When's your trip");
        Assert.assertEquals(airbnbSearchSteps.getResultText2(), form2);
        System.out.println("Comparacion del When's your trip pasado");
        airbnbSearchSteps.clickSkip();
        System.out.println("Estamos funcionando bien con el skip");

    }

    @And("hago clic en el botón de search")
    public void hagoClicEnElBotónDeBúsqueda() {
        airbnbSearchSteps.clickSear();

    }
    @Then("debería ver el mensaje {string}")
    public void deberíaVerElMensaje(String text) {
        Assert.assertEquals(airbnbSearchSteps.getResultText3(), text);
        System.out.println("Automatizacion Lista");
    }
}
