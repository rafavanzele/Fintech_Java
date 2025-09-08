package br.com.fiap.meufintech.model;

public class ContaNormal extends Conta {

    public ContaNormal(int registro, Usuario usuario) {
        super(registro, usuario);
    }

    //Métodos:
    @Override
    public void adicionarReceita(Receita receita) {
        if (transacoesDisponiveis > 0) {
            this.totalReceitas += receita.getValor();
            transacoesDisponiveis -= 1;
            System.out.println("br.com.fiap.meufintech.model.Receita no valor de R$" + receita.getValor() + "add com sucesso!");
        } else {
            System.out.println("Limite de transações antigido! Faça uma nova recarga!");
        }
    }

    @Override
    public void adicionarDespesa(Despesa despesa) {
        if (transacoesDisponiveis > 0) {
            this.totalDespesas -= despesa.getValor();
            transacoesDisponiveis -= 1;

            System.out.println("br.com.fiap.meufintech.model.Despesa no valor de R$" + despesa.getValor() + "add com sucesso!");
        } else {
            System.out.println("Limite de transações antigido! Faça uma nova recarga!");
        }
    }



    //métodos
    @Override
    public void renovarConta(int novaTransacao) {
        double valorCadaTransacao = 5.00;

        if (novaTransacao > 10) {
            valorCadaTransacao = 4.00;
        }

        transacoesDisponiveis += novaTransacao;
        System.out.println(novaTransacao + " transações no valor de R$" + (novaTransacao * valorCadaTransacao) + "add com sucesso");
        System.out.println("Quantidade disponíveis: " + transacoesDisponiveis);


    }

}
