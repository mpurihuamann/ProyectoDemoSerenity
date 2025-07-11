package com.co.demo.page;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.serenity.is/")
public class LoginPage extends PageObject {

    public static final Target USERNAME = Target.the("username field")
            .locatedBy("#LoginPanel0_Username");

    public static final Target PASSWORD = Target.the("password field")
            .locatedBy("#LoginPanel0_Password");

    public static final Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("#LoginPanel0_LoginButton");

}
