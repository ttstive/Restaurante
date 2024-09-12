import java.util.Locale;
import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Registro do cliente
        System.out.println("Digite seu nome >");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite seu endereco >");
        String enderecoCliente = sc.nextLine();
        System.out.println("Digite seu telefone >");
        String telefoneCliente = sc.nextLine();

        Clientes cliente = new Clientes(nomeCliente, enderecoCliente, telefoneCliente);

        System.out.println("Cliente registrado:");
        System.out.println(cliente);

        // Registro do item do menu
        System.out.println("\nDigite o nome do item do menu >");
        String nomeItem = sc.nextLine();
        System.out.println("Digite a categoria do item do menu >");
        String categoriaItem = sc.nextLine();
        System.out.println("Digite o preço do item do menu >");
        double precoItem = sc.nextDouble();
        sc.nextLine(); // Consumir a nova linha

        ItemMenu itemMenu = new ItemMenu(nomeItem, categoriaItem, precoItem);

        System.out.println("Item do menu registrado:");
        System.out.println(itemMenu);

        // Criação do pedido
        System.out.println("\nDeseja criar um pedido? (S/n)");
        char confirmaPedido = sc.nextLine().charAt(0);

        if (confirmaPedido == 'S' || confirmaPedido == 's') {
            System.out.println("Digite o nome do item para o pedido >");
            String nomePedido = sc.nextLine();
            System.out.println("Digite o preço do item para o pedido >");
            double precoPedido = sc.nextDouble();
            System.out.println("Digite a quantidade desejada >");
            int quantidadePedido = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha

            Pedido pedido = new Pedido(nomePedido, false, precoPedido, quantidadePedido);

            System.out.println("Pedido criado:");
            System.out.println(pedido);

            // Atualizar o pedido
            System.out.println("\nDeseja atualizar a quantidade do pedido? (S/n)");
            char confirmaAtualizar = sc.nextLine().charAt(0);

            if (confirmaAtualizar == 'S' || confirmaAtualizar == 's') {
                System.out.println("Digite a nova quantidade >");
                int novaQuantidade = sc.nextInt();
                sc.nextLine(); // Consumir a nova linha
                pedido.atualizarQuantidade(novaQuantidade);
                System.out.println("Pedido atualizado:");
                System.out.println(pedido);
            }

            // Remover itens do pedido
            System.out.println("\nDeseja remover itens do pedido? (S/n)");
            char confirmaRemover = sc.nextLine().charAt(0);

            if (confirmaRemover == 'S' || confirmaRemover == 's') {
                System.out.println("Digite a quantidade a ser removida >");
                int quantidadeRemover = sc.nextInt();
                sc.nextLine(); // Consumir a nova linha
                pedido.removerQuantidade(quantidadeRemover);
                System.out.println("Pedido após remoção:");
                System.out.println(pedido);
            }
        }

        sc.close();
    }
}
