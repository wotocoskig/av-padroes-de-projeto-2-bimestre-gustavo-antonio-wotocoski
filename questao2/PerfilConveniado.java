package questao2;

public class PerfilConveniado implements PerfilCobranca {
    public static final int MINUTOS_TOLERANCIA_GRATUITA = 30;
    public static final double VALOR_HORA_INICIADA = 12.00;
    public static final double PERCENTUAL_DESCONTO = 0.25;
    public static final double MINUTOS_POR_HORA = 60.0;

    @Override
    public String getNomePerfil() {
        return "Conveniado";
    }

    @Override
    public double calcularTarifa(int tempoPermanenciaMinutos) {
        if (tempoPermanenciaMinutos <= MINUTOS_TOLERANCIA_GRATUITA) {
            return 0.0;
        }
        int minutosExcedentes = tempoPermanenciaMinutos - MINUTOS_TOLERANCIA_GRATUITA;
        double horasIniciadas = Math.ceil(minutosExcedentes / MINUTOS_POR_HORA);
        double valorBruto = horasIniciadas * VALOR_HORA_INICIADA;
        return valorBruto * (1.0 - PERCENTUAL_DESCONTO);
    }
}
