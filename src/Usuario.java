public class Usuario {

    //Atributos
    String nome;

    String email;


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
