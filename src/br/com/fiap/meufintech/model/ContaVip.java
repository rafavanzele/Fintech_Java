package br.com.fiap.meufintech.model;

public class ContaVip extends Conta {

    private int qtdDiasVIP = 30;




    public ContaVip(int registro, Usuario usuario) {
        super(registro, usuario);
    }




    @Override
    public void adicionarReceita(Receita receita) {
        if (qtdDiasVIP > 0) {
            totalReceitas += receita.getValor();
        } else {
            if (transacoesDisponiveis > 0) {
                totalReceitas += receita.getValor();
                transacoesDisponiveis -= 1;
            } else {
                System.out.println("Renove sua conta VIP ou compre novas transações.");
            }
        }
    }

    @Override
    public void adicionarDespesa(Despesa despesa) {
        if (qtdDiasVIP > 0) {
            totalDespesas += despesa.getValor();
        } else {
            if (transacoesDisponiveis > 0 ) {
                totalDespesas += despesa.getValor();
                transacoesDisponiveis -= 1;
            } else {
                System.out.println("Renove sua conta VIP ou compre novas transações.");
            }
        }
    }

    @Override
    public void renovarConta(int maisDiasVIP) {
        qtdDiasVIP += maisDiasVIP;
        transacoesDisponiveis = 5;
        System.out.println(maisDiasVIP + " dias VIP add com sucesso! Agora você tem um total de " + qtdDiasVIP + "dias VIP!");
    }

}
