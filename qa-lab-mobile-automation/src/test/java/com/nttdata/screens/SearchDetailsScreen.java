package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchDetailsScreen extends PageObject {

    @AndroidFindBy(id="com.airbnb.android:id/input_bar_input")
    private WebElement searchDetailInput;

    @AndroidFindBy(id="com.airbnb.android:id/input_bar_input")
    private WebElement searchDetailInputText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.airbnb.android:id/title\" and @text=\"Cancún, Quintana Roo, Mexico\"]")
    private WebElement firstOption;

    @AndroidFindBy(id = "com.airbnb.android:id/n2_simple_search_footer_gradient_button")
    private WebElement nextButton;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Increment\"])[1]")
    private WebElement buttonAdulto;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.airbnb.android:id/n2_simple_search_footer_link\"]")
    private WebElement buttonSkip;
    @AndroidFindBy(id = "com.airbnb.android:id/where_autocomplete_recycler_view")
    private WebElement intento;

    @AndroidFindBy(id = "com.airbnb.android:id/n2_dls_action_footer_gradient_button")
    private WebElement searchButton;


    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.airbnb.android:id/n2_dls_action_footer_gradient_button\"]")
    private WebElement sear;
    @AndroidFindBy(id = "//android.widget.Button[@content-desc=\"Filters, 0 filters applied\"]")
    private WebElement filtro;

    @AndroidFindBy(id = "//android.widget.Button[@content-desc=\"Show 1,000+ places\"]")
    private WebElement btnFiltro;



    public void enterSearchInput(String place){
        System.out.println("Texto1");
        searchDetailInput.click();
        Actions actions = new Actions(getDriver());
        actions.click(searchDetailInput).build().perform();
        System.out.println("Texto2");
        searchDetailInputText.sendKeys(place);
        try {

            System.out.println("Buscar");
            WebDriverWait wait = new WebDriverWait(getDriver(), 10);
            wait.until(ExpectedConditions.elementToBeClickable(searchDetailInputText));
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            actions.sendKeys(searchDetailInputText, Keys.ENTER).build().perform();

        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }


    }

    public void clickFirstOption(){
        firstOption.click();
    }

    public void clickNext(){
        nextButton.click();
    }

    public void clickSearch(){
        System.out.println("Antes de adulto");
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(buttonAdulto));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        buttonAdulto.click();
        System.out.println("Despues de adulto");
        WebDriverWait weit = new WebDriverWait(getDriver(), 20);
        weit.until(ExpectedConditions.elementToBeClickable(searchButton));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        searchButton.click();
        System.out.println("Se pudo");
    }

    public void clickSkip() {
        buttonSkip.click();

    }

    public void clickSear() {
        sear.click();

    }

    public void clickFiltro() {
        filtro.click();
    }
}
