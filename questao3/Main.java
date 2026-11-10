package questao3;

import java.util.Locale;

public class Main {
    private static void imprimirPedido(int numeroPedido, Bebida pedido) {
        System.out.printf(
                Locale.forLanguageTag("pt-BR"),
                "Pedido %d: %s | Preco Total: R$ %.2f%n",
                numeroPedido,
                pedido.getDescricao(),
                pedido.getPreco()
        );
    }

    public static void main(String[] args) {
        Bebida pedido1 = new Chantilly(new Leite(new Espresso()));
        Bebida pedido2 = new Calda(new Leite(new Cha()));
        Bebida pedido3 = new Calda(new Chantilly(new Chantilly(new Espresso())));

        System.out.println("=== Relatorio de Pedidos da Cafeteria ===");
        imprimirPedido(1, pedido1);
        imprimirPedido(2, pedido2);
        imprimirPedido(3, pedido3);
    }
}
