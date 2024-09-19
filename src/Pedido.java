import java.util.ArrayList;
import java.util.List;

public class Pedido {
     private List<ItemMenu> itensMenu;
     private Clientes clientes;
     private double total;
     private String status;

     public Pedido(){
          this.itensMenu = new ArrayList<>();
          this.total = 0.0; // começa zerado pois não tem pedido ainda
          this.status = "Em aberto";
     }

     // Adiciona um item ao pedido e atualiza o total
     public void adicionarItem(ItemMenu item){
          itensMenu.add(item);
          total += item.getPreco(); // Soma o preço do item ao total
     }

     // Mostra o item de índice i no pedido
     public void mostraPedido(int i){
          System.out.println(itensMenu.get(i));
     }

     // Calcula e retorna o total do pedido
     public double calculaTotal(){
          return total;
     }

     // Atualiza o status do pedido
     public void atualizaStatusPedido(String novoStatus){
          this.status = novoStatus;
          System.out.println("Status atualizado para: " + this.status);
     }

     public double getTotal(){
          return total;
     }

     @Override
     public String toString() {
          StringBuilder sb = new StringBuilder();
          sb.append("Itens do Pedido:\n");
          for (ItemMenu item : itensMenu) {
               sb.append(item).append("\n");
          }
          sb.append("Total: R$").append(String.format("%.2f", total)).append("\n");
          sb.append("Status do pedido: ").append(status);
          return sb.toString();
     }
}
