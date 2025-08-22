public class Despesa {

    //Atributos
    String nome;

    String data;

    double valor;


    //Construtores
    public Despesa(String nome, String data, double valor) {
        this.nome = nome;
        this.data = data;
        this.valor = valor;
    }

    public Despesa() {
    }


    //Métodos
    public void exibirInformacoesDespesa() {
        System.out.println("Nome da despesa: " + nome);
        System.out.println("Data da despesa: " + data);
        System.out.println("Valor da despesa (R$): " + valor);
    }

    public void addDespesa(double novaDespesa) {
        valor += novaDespesa;
        System.out.println("Despesa adicionada com sucesso! O novo total das despesas é: R$" + valor);
    }


}
