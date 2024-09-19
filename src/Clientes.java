import java.util.Scanner;

public class Clientes {
    int num_cliente;
    private String[] nome;
    private String[] endereco;
    private String[] telefone;

    public void registrarCliente() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Seja bem vindo ao restaurante do Junin");
            System.out.println("Mesa para quantos?");
            this.num_cliente = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            this.nome = new String[num_cliente];
            this.endereco = new String[num_cliente];
            this.telefone = new String[num_cliente];

            for (int i = 0; i < num_cliente; i++) {
                System.out.println("___ Cliente " + (i + 1) + " ____");
                System.out.println("Qual o seu nome?");
                this.nome[i] = sc.nextLine();
                System.out.println("Qual o seu endereço?");
                this.endereco[i] = sc.nextLine();
                System.out.println("Qual o seu telefone?");
                this.telefone[i] = sc.nextLine();
            }
        }
    }

    public void visualizarCliente() {
        for (int i = 0; i < num_cliente; i++) {
            System.out.println("___ Cliente " + (i + 1) + " ____");
            System.out.println("Nome: " + nome[i]);
            System.out.println("Endereço: " + endereco[i]);
            System.out.println("Telefone: " + telefone[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num_cliente; i++) {
            sb.append("___ Cliente ").append(i + 1).append(" ____\n")
                    .append("Nome: ").append(nome[i]).append("\n")
                    .append("Endereço: ").append(endereco[i]).append("\n")
                    .append("Telefone: ").append(telefone[i]).append("\n\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Clientes clientes = new Clientes();
        clientes.registrarCliente();
        System.out.println(clientes); // Irá chamar automaticamente o método toString()
    }
}
