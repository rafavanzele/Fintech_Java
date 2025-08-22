public class Balanco {

    //Atributos:
    double totalReceitas;

    double totalDespesas;


    //Construtores:
    public Balanco(double totalReceitas, double totalDespesas) {
        this.totalReceitas = totalReceitas;
        this.totalDespesas = totalDespesas;
    }

    public Balanco() {
    }


    //Métodos:
    public double calcularSaldo() {
        return totalReceitas - totalDespesas;
    }

    public void exibirBalanco() {
        System.out.println("Total de receitas: R$" + totalReceitas);
        System.out.println("Total de despesas: R$" + totalDespesas);
        System.out.println("Saldo do mês: R$" + calcularSaldo());
    }



}
