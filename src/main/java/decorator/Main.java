package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente Pedido = new Pao();

        Pedido = new Bacon(Pedido);
        Pedido = new Queijo(Pedido);
        Pedido = new Ketchup(Pedido);
        Pedido = new Salada(Pedido);

        System.out.println("Itens do pedido: " + Pedido.imprimeIngrediente());
        System.out.println("Valor total: R$ " + Pedido.valorDoIngrediente());
    }
}
