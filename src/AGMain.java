package agjava2025;

public class AGMain {

    public static void main(String[] args) {
        int numeroGeracoes = 30;
        int tamanhoPopulacao = 100;
        int probabilidadeMutacao = 5;
        int qtdeCruzamentos = 10;
        double capacidadeMochila = 8;
        AlgoritmoGenetico meuAg = new AlgoritmoGenetico(numeroGeracoes,
                tamanhoPopulacao, probabilidadeMutacao,
                qtdeCruzamentos, capacidadeMochila);

        meuAg.carregaArquivo("dados50.csv");
        meuAg.executar();
        /*
         * AGBruteForce meuBruteForce = new AGBruteForce(8);
         * meuBruteForce.carregaArquivo("dados30.csv");
         * meuBruteForce.resolver();
         * meuBruteForce.mostrarMelhorSolucao();
         */
    }

}
