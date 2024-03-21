package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoWhatsappTest {
    @Test
    void deveIdentificarUsuárioLogado() {
        IServico servico = ServicoFactory.obterServico("Whatsapp");
        assertEquals("Usuário Logado no Whatsapp", servico.iniciarSessao());
    }

    @Test
    void deveIdentificarUsuárioDeslogado() {
        IServico servico = ServicoFactory.obterServico("Whatsapp");
        assertEquals("Usuário deslogado no Whatsapp", servico.encerrarSessao());
    }


}