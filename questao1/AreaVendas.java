package questao1;

import java.util.HashSet;
import java.util.Set;

public class AreaVendas implements ObservadorEstoque {
    private final Set<String> produtosComEstoqueZerado;

    public AreaVendas() {
        this.produtosComEstoqueZerado = new HashSet<>();
    }

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade == 0) {
            produtosComEstoqueZerado.add(nomeProduto);
        } else if (novaQuantidade > 0 && produtosComEstoqueZerado.contains(nomeProduto)) {
            produtosComEstoqueZerado.remove(nomeProduto);
            System.out.println("[Vendas] ALERTA: O produto '" + nomeProduto
                    + "' voltou a ter estoque (" + novaQuantidade + " unidades) após ter zerado.");
        }
    }
}
