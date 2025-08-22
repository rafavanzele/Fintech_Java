public class Receita {

    //Atributos
    String nome;

    String data;

    double valor;


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


    public void addReceita(double novaReceita) {
        valor += novaReceita;
        System.out.println("Receita adicionada com sucesso! Seu novo montante é: R$" + valor);
    }
}
