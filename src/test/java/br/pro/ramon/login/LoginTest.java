package br.pro.ramon.login;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void testLoginAutorizado() {
        String login = "admin";
        String senha = "r**t";
        LoginService loginService = new LoginService();
        boolean resultado = loginService.login(login, senha);

        assertThat(resultado, is(true));
    }

    @Test
    public void testLoginErrado() {
        String login = "usuario";
        String senha = "r**t";
        LoginService loginService = new LoginService();
        boolean resultado = loginService.login(login, senha);

        assertThat(resultado, is(false));
    }

    @Test
    public void testSenhaErrada() {
        String login = "admin";
        String senha = "123456";
        LoginService loginService = new LoginService();
        boolean resultado = loginService.login(login, senha);

        assertThat(resultado, is(false));
    }

    @Test
    public void testLoginESenhaErrados() {
        String login = "usuario";
        String senha = "123456";
        LoginService loginService = new LoginService();
        boolean resultado = loginService.login(login, senha);

        assertThat(resultado, is(false));
    }

}
