package steps;

import commons.DriverFactory;
import config.ConstantsUrls;
import config.Users;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setup() {
        this.driver = DriverFactory.getNewInstance();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Dado("que acesse a pagina de login")
    public void que_acesse_a_pagina_de_login() {
        driver.get(ConstantsUrls.URL_LOGIN);
    }

    @Quando("realizo o login do usuario")
    public void realizo_o_login_do_usuario() {
        loginPage.login(Users.UserLogin,Users.PasswordLogin);
    }

    @Entao("devo estar logado")
    public void devo_estar_logado() {
        loginPage.usuarioLogado();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
