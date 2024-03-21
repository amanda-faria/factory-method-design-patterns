package org.example;

public class ServicoFacebook implements IServico {

    public String iniciarSessao() {
        return "Usuário Logado no Facebook";
    }

    public String encerrarSessao() {
        return "Usuário deslogado no Facebook";
    }
}