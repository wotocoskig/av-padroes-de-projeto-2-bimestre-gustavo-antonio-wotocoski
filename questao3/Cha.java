package questao3;

public class Cha implements Bebida {
    public static final double PRECO_BASE = 4.50;

    @Override
    public String getDescricao() {
        return "Chá";
    }

    @Override
    public double getPreco() {
        return PRECO_BASE;
    }
}
