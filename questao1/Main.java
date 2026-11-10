package questao1;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook Gamer", 10);

        ObservadorEstoque compras = new AreaCompras();
        ObservadorEstoque vendas = new AreaVendas();
        ObservadorEstoque auditoria = new AreaAuditoria();

        produto.adicionarObservador(compras);
        produto.adicionarObservador(vendas);
        produto.adicionarObservador(auditoria);

        System.out.println("=== 1. Alterando estoque de 10 para 4 unidades ===");
        produto.setQuantidade(4);

        System.out.println("\n=== 2. Definindo novamente 4 unidades (sem mudanca real) ===");
        produto.setQuantidade(4);

        System.out.println("\n=== 3. Alterando estoque de 4 para 0 unidades ===");
        produto.setQuantidade(0);

        System.out.println("\n=== 4. Alterando estoque de 0 para 12 unidades (reposicao apos zerar) ===");
        produto.setQuantidade(12);

        System.out.println("\n=== 5. Removendo a area de Compras e alterando estoque para 2 unidades ===");
        produto.removerObservador(compras);
        produto.setQuantidade(2);
    }
}
