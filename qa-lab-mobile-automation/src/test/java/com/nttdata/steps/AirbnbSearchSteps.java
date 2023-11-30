package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AirbnbSearchSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;


    @Step("Click en cerrar")
    public void clickClose(){
        loginScreen.clickClose();
    }

    public void searchByText(String place){
        System.out.println("Se hará click en busqueda...");
        searchScreen.clickSearchInput();
        System.out.println("Se ingresara a la busqueda...");
        searchDetailsScreen.enterSearchInput(place);
        System.out.println("Parte de Busqueda Correcta");

    }
    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        System.out.println("Primera comparacion de texto");
        return searchScreen.getResultText();

    }

    public void clickSkip() {
        System.out.println("Antes de Skip");
        searchDetailsScreen.clickSkip();
        System.out.println("Despues de Skip");
    }


    public String getResultText2() {
        System.out.println("Segunda comparacion de texto");
        return searchScreen.getResultText2();

    }

    public void clickSear() {
        searchDetailsScreen.clickSear();
    }

    public void clickFiltro() {
        searchDetailsScreen.clickFiltro();
    }


    public String getResultText3() {
        System.out.println("Tercera comparacion de texto");
        return searchScreen.getResultText3();
    }


}
