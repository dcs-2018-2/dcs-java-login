package br.pro.ramon.login;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void testLoginAutorizado() {
        // ENTRADA
        String login = "admin";
        String senha = "r**t";
        
        // PROCESSAMENTO
        LoginProgram program = new LoginProgram();
        
        // SAÍDA
        String saida = program.login(login, senha);

        assertThat(saida, is("Autorizado"));
    }

    @Test
    public void testLoginErrado() {
        // ENTRADA
        String login = "usuario";
        String senha = "r**t";
        
        // PROCESSAMENTO
        LoginProgram program = new LoginProgram();
        
        // SAÍDA
        String saida = program.login(login, senha);

        assertThat(saida, is("Não Autorizado"));
    }

    @Test
    public void testSenhaErrada() {
        // ENTRADA
        String login = "admin";
        String senha = "123456";
        
        // PROCESSAMENTO
        LoginProgram program = new LoginProgram();
        
        // SAÍDA
        String saida = program.login(login, senha);

        assertThat(saida, is("Não Autorizado"));
    }

    @Test
    public void testLoginESenhaErrados() {
        // ENTRADA
        String login = "usuario";
        String senha = "123456";
        
        // PROCESSAMENTO
        LoginProgram program = new LoginProgram();
        
        // SAÍDA
        String saida = program.login(login, senha);

        assertThat(saida, is("Não Autorizado"));
    }

}
