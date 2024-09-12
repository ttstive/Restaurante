import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pedido {
   private String nomePedido;
   private  boolean status;
   private double preco;
   private int quantidade;
    private String[] itensPedidos;

    public Pedido (String nomePedido, boolean status, double preco, int quantidade) {
        this.nomePedido = nomePedido;
        this.status = status;
        this.preco = preco;
        this.quantidade = quantidade;
        this.itensPedidos = new String[] {nomePedido, status, preco, quantidade};
    }

    public int defQuantidade(){
        Scanner sc = new Scanner(System.in);
        char confirma = sc.next().charAt(0);
        System.out.println("Você deseja comprar mais do que 1 ? (S/n");
        if (confirma == 'S'){
            System.out.println("Qual quantiade deseja pedir?");
            quantidade = sc.nextInt();
            quantidade += quantidade;

        }
        public int excQuantidade(){
            Scanner sc = new Scanner(System.in);
            char confirma = sc.next().charAt(0);
            System.out.println("Você deseja comprar mais do que 1 ? (S/n");
            if (confirma == 'S'){
                System.out.println("Qual quantiade deseja pedir?");
                quantidade = sc.nextInt();
        }
    }

}