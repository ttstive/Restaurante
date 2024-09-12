import java.util.Scanner;

public class Clientes {
    private String nome;
    private String endereco;
    private String telefone;

    private String[] dados;

    // Constructor
    public Clientes(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        updateDados();
    }

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        updateDados();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
        updateDados();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
        updateDados();
    }

    private void updateDados() {
        this.dados = new String[] { nome, endereco, telefone };
    }

    public void registrarCliente() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite seu nome >");
            nome = sc.nextLine();
            System.out.println("Digite seu endereco >");
            endereco = sc.nextLine();
            System.out.println("Digite seu telefone >");
            telefone = sc.nextLine();
            updateDados();
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Endereco: " + endereco + "\n" +
                "Telefone: " + telefone;
    }
}
