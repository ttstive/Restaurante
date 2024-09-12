import java.util.Scanner;

public class Pedido {
    private String nomePedido;
    private boolean status;
    private double preco;
    private int quantidade;
    private String[] itensPedidos;
    private static final Scanner scanner = new Scanner(System.in);

    public Pedido(String nomePedido, boolean status, double preco, int quantidade) {
        this.nomePedido = nomePedido;
        this.status = status;
        this.preco = preco;
        this.quantidade = quantidade;
        updateItensPedidos();
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
        updateItensPedidos();
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        updateItensPedidos();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        updateItensPedidos();
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
        updateItensPedidos();
    }

    private void updateItensPedidos() {
        itensPedidos = new String[] {
                nomePedido,
                String.valueOf(status),
                String.valueOf(preco),
                String.valueOf(quantidade)
        };
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.nomePedido = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        updateItensPedidos();
        System.out.println("Item adicionado ao pedido!");
    }

    public void atualizarQuantidade(int quantidade) {
        this.quantidade = quantidade;
        updateItensPedidos();
        System.out.println("Quantidade atualizada!");
    }

    public void removerQuantidade(int quantidade) {
        this.quantidade = Math.max(0, this.quantidade - quantidade); // Não permite quantidade negativa
        updateItensPedidos();
        System.out.println("Quantidade removida!");
    }

    private void mostrarCardapio() {
        // Para demonstração, isso está codificado; na prática, use dados da classe ItemMenu
        System.out.println("Cardápio:");
        System.out.println("1. Pizza - R$29.90");
        System.out.println("2. Refrigerante - R$7.50");
    }

    @Override
    public String toString() {
        return "Pedido: " + nomePedido + "\n" +
                "Status: " + (status ? "Finalizado" : "Em andamento") + "\n" +
                "Preço: R$" + preco + "\n" +
                "Quantidade: " + quantidade;
    }
}
