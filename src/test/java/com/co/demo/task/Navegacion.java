package com.co.demo.task;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.co.demo.page.HomePage;

public class navegacion implements Task {

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.NORTHWIND_MENU),
                Click.on(HomePage.CLIENTES_OPTION)
        );
    }

    public static navegacion navigate() {
        return instrumented(navegacion.class);
    }
}
