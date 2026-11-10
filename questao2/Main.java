package questao2;

public class Main {
    public static void main(String[] args) {
        int tempoPermanenciaPadrao = 135;

        System.out.println("=== 1. Calculo para o mesmo tempo de permanencia (135 min) nos tres perfis ===");
        TiqueteEstacionamento tiqueteRotativo = new TiqueteEstacionamento("ABC-1D23", tempoPermanenciaPadrao, new PerfilRotativo());
        TiqueteEstacionamento tiqueteMensalista = new TiqueteEstacionamento("EFG-4H56", tempoPermanenciaPadrao, new PerfilMensalista());
        TiqueteEstacionamento tiqueteConveniado = new TiqueteEstacionamento("IJK-7L89", tempoPermanenciaPadrao, new PerfilConveniado());

        tiqueteRotativo.imprimirResumo();
        tiqueteMensalista.imprimirResumo();
        tiqueteConveniado.imprimirResumo();

        System.out.println("\n=== 2. Troca de perfil de cobranca em um mesmo tiquete em tempo de execucao ===");
        TiqueteEstacionamento tiqueteDinamico = new TiqueteEstacionamento("XYZ-9W87", 135, new PerfilRotativo());
        tiqueteDinamico.imprimirResumo();

        tiqueteDinamico.setPerfilCobranca(new PerfilConveniado());
        tiqueteDinamico.imprimirResumo();

        tiqueteDinamico.setPerfilCobranca(new PerfilMensalista());
        tiqueteDinamico.imprimirResumo();
    }
}
