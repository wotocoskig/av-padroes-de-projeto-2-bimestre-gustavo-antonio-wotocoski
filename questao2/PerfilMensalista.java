package questao2;

public class PerfilMensalista implements PerfilCobranca {
    public static final double VALOR_FIXO_MENSALISTA = 25.00;

    @Override
    public String getNomePerfil() {
        return "Mensalista";
    }

    @Override
    public double calcularTarifa(int tempoPermanenciaMinutos) {
        return VALOR_FIXO_MENSALISTA;
    }
}
