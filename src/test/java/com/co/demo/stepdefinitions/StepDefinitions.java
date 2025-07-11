package com.co.demo.stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import com.co.demo.task.LoginTask;
import com.co.demo.page.LoginPage;

public class StepDefinitions {

    @Given("I ingreso a la pagina web")
    public void iIngresoALaPaginaWeb() {

        Actor user = Actor.named("user");

        user.attemptsTo(
                Open.browserOn().the(LoginPage.class),
                LoginTask.withCredentials("admin", "serenity"),
                Click.on(LoginPage.NORTHWIND_MENU),
                Click.on(LoginPage.CLIENTES_MENU)
        );
    }
}
