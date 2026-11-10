package questao1;

public interface AssuntoEstoque {
    void adicionarObservador(ObservadorEstoque observador);
    void removerObservador(ObservadorEstoque observador);
    void notificarObservadores();
}
