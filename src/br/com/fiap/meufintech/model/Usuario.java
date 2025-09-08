package br.com.fiap.meufintech.model;

public class Usuario {

    //Atributos
    private String nome;

    private String email;

    private Conta conta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    //Construtores
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Usuario() {
    }


    //Metodo
    public void exibirUsuario() {
        System.out.println("Nome do usuário: " + nome);
        System.out.println("Email do usuário: " + email);
    }
}
