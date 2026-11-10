package questao1;

public class AreaCompras implements ObservadorEstoque {
    public static final int LIMITE_MINIMO_ESTOQUE = 5;

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < LIMITE_MINIMO_ESTOQUE) {
            System.out.println("[Compras] ALERTA: Estoque do produto '" + nomeProduto
                    + "' abaixo de " + LIMITE_MINIMO_ESTOQUE + " unidades (Quantidade atual: " + novaQuantidade + ").");
        }
    }
}
