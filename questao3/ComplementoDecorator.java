package questao3;

public abstract class ComplementoDecorator implements Bebida {
    protected final Bebida bebida;

    public ComplementoDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }

    @Override
    public double getPreco() {
        return bebida.getPreco();
    }
}
