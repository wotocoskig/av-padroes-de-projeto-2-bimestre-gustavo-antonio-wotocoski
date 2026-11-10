package questao1;

public class AreaAuditoria implements ObservadorEstoque {

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        System.out.println("[Auditoria] Registro: Estoque do produto '" + nomeProduto
                + "' alterado para " + novaQuantidade + " unidades.");
    }
}
