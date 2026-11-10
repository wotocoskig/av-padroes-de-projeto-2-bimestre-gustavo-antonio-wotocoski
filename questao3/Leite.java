package questao3;

public class Leite extends ComplementoDecorator {
    public static final double PRECO_ADICIONAL = 2.00;

    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Leite";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + PRECO_ADICIONAL;
    }
}
