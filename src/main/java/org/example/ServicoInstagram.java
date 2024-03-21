package org.example;

public class ServicoInstagram implements IServico {

    public String iniciarSessao() {
        return "Usuário Logado no Instagram";
    }

    public String encerrarSessao() {
        return "Usuário deslogado no Instagram";
    }
}
