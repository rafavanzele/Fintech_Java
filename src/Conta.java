public class Conta {

    int registro;

    double saldo = 0;

    Usuario usuario;

    double totalReceitas;

    double totalDespesas;

    //Contrutores:
    public Conta(int registro, Usuario usuario) {
        this.registro = registro;
        this.usuario = usuario;
    }

    public Conta() {};


    //Métodos:
    public void detalheConta() {
        System.out.println("Usuário: " + usuario.nome);
        System.out.println("Numero de registro: " + registro);
        System.out.println("Saldo (R$): " + saldoConta());
    }

    public double saldoConta() {
        return totalReceitas - totalDespesas;
    }

    public void adicionarReceita(Receita receita) {
        totalReceitas += receita.valor;
        receita.exibirInformacoesReceita();
    }

    public void adicionarDespesa(Despesa despesa) {
        totalDespesas += despesa.valor;
        despesa.exibirInformacoesDespesa();
    }
}
