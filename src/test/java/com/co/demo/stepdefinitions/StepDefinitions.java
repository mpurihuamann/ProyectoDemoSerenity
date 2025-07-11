package com.co.demo.stepdefinitions;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import com.co.demo.page.HomePage;
import com.co.demo.task.LoginTask;
import com.co.demo.task.Navegacion;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Y;
import io.cucumber.java.es.Entonces;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class StepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que ingreso a la pagina web de Serenity")
    public void queIngresoALaPaginaWebDeSerenity() {
        OnStage.theActorCalled("Mer").wasAbleTo(
                LoginTask.withCredentials("admin", "serenity")
        );
    }

    @Cuando("hago clic en el enlace {string}")
    public void hagoClicEnElEnlace(String enlace) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Navegacion.navigate()
        );
    }

    @Y("hago clic en la opción {string}")
    public void hagoClicEnLaOpcion(String opcion) {
    }

    @Entonces("debería ver la lista de clientes en pantalla")
    public void deberiaVerLaListaDeClientesEnPantalla() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(the(HomePage.LISTA_CLIENTES), isVisible())
        );
    }
}
