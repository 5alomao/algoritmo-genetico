package agjava2025;

public class AGMain {

    public static void main(String[] args) {
        // AGBruteForce meuBruteForce = new AGBruteForce(8);
        // meuBruteForce.carregaArquivo("dados.csv");
        // meuBruteForce.resolver();
        // meuBruteForce.mostrarMelhorSolucao();

        int numeroGeracoes = 20;
        int tamanhoPopulacao = 100;
        int probabilidadeMutacao = 5;
        int quantidadeCruzamento = 10;
        double capacidadeMochila = 8.0;

        AlgoritmoGenetico algGen = new AlgoritmoGenetico(numeroGeracoes, tamanhoPopulacao, probabilidadeMutacao,
                quantidadeCruzamento, capacidadeMochila);

        algGen.carregaArquivo("dados.csv");
    }

}
