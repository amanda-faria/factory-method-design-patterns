package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoInstagramTest {
    @Test
    void deveIdentificarUsuárioLogado() {
        IServico servico = ServicoFactory.obterServico("Instagram");
        assertEquals("Usuário Logado no Instagram", servico.iniciarSessao());
    }

    @Test
    void deveIdentificarUsuárioDeslogado() {
        IServico servico = ServicoFactory.obterServico("Instagram");
        assertEquals("Usuário deslogado no Instagram", servico.encerrarSessao());
    }

}