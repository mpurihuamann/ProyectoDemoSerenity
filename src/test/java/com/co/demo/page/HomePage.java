package com.co.demo.page;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target NORTHWIND_MENU = Target.the("Northwind menu")
            .locatedBy("//a[contains(text(),'Northwind')]");

    public static final Target CLIENTES_OPTION = Target.the("Clientes option")
            .locatedBy("//a[contains(text(),'Clientes')]");
}
