package br.com.fiap.meufintech.model;

public abstract class Conta {

    protected int transacoesDisponiveis = 5;

    private int registro;

    private double saldo = 0;

    private Usuario usuario;

    protected double totalReceitas;

    protected double totalDespesas;




    public Conta(int registro, Usuario usuario) {
        this.registro = registro;
        this.usuario = usuario;
    }

    //Métodos:
    public void detalheConta() {
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Numero de registro: " + registro);
        System.out.println("Saldo (R$): " + saldoConta());
    }

    public double saldoConta() {
        return totalReceitas - totalDespesas;
    }

    public abstract void adicionarReceita(Receita receita);

    public abstract void adicionarDespesa(Despesa despesa);

    public abstract void renovarConta(int quantidadeTransacoes);
}
