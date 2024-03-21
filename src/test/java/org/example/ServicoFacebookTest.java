package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFacebookTest {
    @Test
    void deveIdentificarUsuárioLogado() {
        IServico servico = ServicoFactory.obterServico("Facebook");
        assertEquals("Usuário Logado no Facebook", servico.iniciarSessao());
    }

    @Test
    void deveIdentificarUsuárioDeslogado() {
        IServico servico = ServicoFactory.obterServico("Facebook");
        assertEquals("Usuário Logado no Facebook", servico.encerrarSessao());
    }

}