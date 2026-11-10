package questao2;

import java.util.Locale;

public class TiqueteEstacionamento {
    private final String placaVeiculo;
    private final int tempoPermanenciaMinutos;
    private PerfilCobranca perfilCobranca;

    public TiqueteEstacionamento(String placaVeiculo, int tempoPermanenciaMinutos, PerfilCobranca perfilCobranca) {
        this.placaVeiculo = placaVeiculo;
        this.tempoPermanenciaMinutos = tempoPermanenciaMinutos;
        this.perfilCobranca = perfilCobranca;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public int getTempoPermanenciaMinutos() {
        return tempoPermanenciaMinutos;
    }

    public PerfilCobranca getPerfilCobranca() {
        return perfilCobranca;
    }

    public void setPerfilCobranca(PerfilCobranca perfilCobranca) {
        this.perfilCobranca = perfilCobranca;
    }

    public double calcularValorPagar() {
        return perfilCobranca.calcularTarifa(tempoPermanenciaMinutos);
    }

    public void imprimirResumo() {
        System.out.printf(
                Locale.forLanguageTag("pt-BR"),
                "Placa: %s | Permanencia: %d min | Perfil: %-11s | Valor a pagar: R$ %.2f%n",
                placaVeiculo,
                tempoPermanenciaMinutos,
                perfilCobranca.getNomePerfil(),
                calcularValorPagar()
        );
    }
}
