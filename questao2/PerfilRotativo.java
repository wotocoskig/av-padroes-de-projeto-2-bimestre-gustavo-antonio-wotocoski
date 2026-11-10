package questao2;

public class PerfilRotativo implements PerfilCobranca {
    public static final double VALOR_HORA_INICIADA = 12.00;
    public static final double MINUTOS_POR_HORA = 60.0;

    @Override
    public String getNomePerfil() {
        return "Rotativo";
    }

    @Override
    public double calcularTarifa(int tempoPermanenciaMinutos) {
        if (tempoPermanenciaMinutos <= 0) {
            return 0.0;
        }
        double horasIniciadas = Math.ceil(tempoPermanenciaMinutos / MINUTOS_POR_HORA);
        return horasIniciadas * VALOR_HORA_INICIADA;
    }
}
