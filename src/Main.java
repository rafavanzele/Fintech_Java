import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int opt;
        int idConta = 1;
        Usuario usuario;
        Conta conta = null;

        do {

            System.out.println("[1] Abrir conta");
            System.out.println("[2] Consultar saldo");
            System.out.println("[3] Adicionar receita");
            System.out.println("[4] Adicionar despesa");
            System.out.println("[5] Detalhes conta");
            System.out.println("[0] Sair");
            System.out.print("Escolha uma opção: ");
            opt = sc.nextInt();


            switch (opt) {
                case 1:
                    System.out.print("Nome do usuário: ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.next() + sc.nextLine();
                    usuario = new Usuario(nome, email);
                    conta = new Conta(idConta, usuario);
                    usuario.conta = conta;
                    break;
                case 2:
                    System.out.println("Saldo da conta: ");
                    System.out.println("R$" + conta.saldoConta());
                    break;
                case 3:
                    System.out.println("Adicionar receita: ");
                    System.out.print("Nome: ");
                    String nomeReceita = sc.next() + sc.nextLine();
                    System.out.print("Data: ");
                    String dataReceita = sc.next() + sc.nextLine();
                    System.out.print("Valor(R$): ");
                    double valorReceita = sc.nextDouble();
                    Receita receita = new Receita(nomeReceita, dataReceita, valorReceita);
                    conta.adicionarReceita(receita);
                    break;
                case 4:
                    System.out.println("Adicionar despesa: ");
                    System.out.print("Nome: ");
                    String nomeDespesa = sc.next() + sc.nextLine();
                    System.out.print("Data: ");
                    String dataDespesa = sc.next() + sc.nextLine();
                    System.out.print("Valor(R$): ");
                    double valorDespesa = sc.nextDouble();
                    Despesa despesa = new Despesa(nomeDespesa, dataDespesa, valorDespesa);
                    conta.adicionarDespesa(despesa);
                    break;
                case 5:
                    System.out.println("Detalhes da conta:");
                    conta.detalheConta();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente");

            }


        } while(opt != 0);





        }
    }
