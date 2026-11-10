package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto implements AssuntoEstoque {
    private final String nome;
    private int quantidade;
    private final List<ObservadorEstoque> observadores;

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
        this.observadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int novaQuantidade) {
        if (this.quantidade != novaQuantidade) {
            this.quantidade = novaQuantidade;
            notificarObservadores();
        }
    }

    @Override
    public void adicionarObservador(ObservadorEstoque observador) {
        if (observador != null && !observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    @Override
    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        List<ObservadorEstoque> copiaObservadores = new ArrayList<>(observadores);
        for (ObservadorEstoque observador : copiaObservadores) {
            observador.atualizar(nome, quantidade);
        }
    }
}
