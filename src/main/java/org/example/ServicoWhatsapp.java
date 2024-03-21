package org.example;

public class ServicoWhatsapp implements IServico {

    public String iniciarSessao() {
        return "Usuário Logado no Whatsapp";
    }

    public String encerrarSessao() {
        return "Usuário deslogado no Whatsapp";
    }
}
