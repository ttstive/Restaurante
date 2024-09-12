public class ItemMenu {
    private String nome;
    private String categoria;
    private double preco;

    public ItemMenu(String nome, String categoria, double preco){
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void getDetalhesItem () {
        System.out.println("Nome: " + nome + "\nCategoria: " + categoria + "\nPreço: " + preco);
    }
    


}
