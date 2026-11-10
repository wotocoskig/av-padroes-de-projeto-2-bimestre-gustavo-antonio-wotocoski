package questao3;

public class Calda extends ComplementoDecorator {
    public static final double PRECO_ADICIONAL = 2.50;

    public Calda(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Calda";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + PRECO_ADICIONAL;
    }
}
