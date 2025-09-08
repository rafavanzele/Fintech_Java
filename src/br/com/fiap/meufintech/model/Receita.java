package br.com.fiap.meufintech.model;

public class Receita {

    //Atributos
    private String nome;

    private String data;

    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //Construtores
    public Receita(String nome, String data, double valor) {
        this.nome = nome;
        this.data = data;
        this.valor = valor;
    }

    public Receita() {
    }


    //Métodos
    public void exibirInformacoesReceita() {
        System.out.println("Nome da receita: " + nome);
        System.out.println("Data da receita: " + data);
        System.out.println("Valor da receita (R$): " + valor);
    }


}
