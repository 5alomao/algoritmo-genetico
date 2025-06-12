package agjava2025;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AlgoritmoGenetico {
    private int tamanhoCromossomo, numeroGeracoes, tamanhoPopulacao, probabilidadeMutacao, quantidadeCruzamento;

    public int getTamanhoCromossomo() {
        return tamanhoCromossomo;
    }

    public void setTamanhoCromossomo(int tamanhoCromossomo) {
        this.tamanhoCromossomo = tamanhoCromossomo;
    }

    public int getNumeroGeracoes() {
        return numeroGeracoes;
    }

    public void setNumeroGeracoes(int numeroGeracoes) {
        this.numeroGeracoes = numeroGeracoes;
    }

    public int getTamanhoPopulacao() {
        return tamanhoPopulacao;
    }

    public void setTamanhoPopulacao(int tamanhoPopulacao) {
        this.tamanhoPopulacao = tamanhoPopulacao;
    }

    public int getProbabilidadeMutacao() {
        return probabilidadeMutacao;
    }

    public void setProbabilidadeMutacao(int probabilidadeMutacao) {
        this.probabilidadeMutacao = probabilidadeMutacao;
    }

    public int getQuantidadeCruzamento() {
        return quantidadeCruzamento;
    }

    public void setQuantidadeCruzamento(int quantidadeCruzamento) {
        this.quantidadeCruzamento = quantidadeCruzamento;
    }

    public double getCapacidadeMochila() {
        return capacidadeMochila;
    }

    public void setCapacidadeMochila(double capacidadeMochila) {
        this.capacidadeMochila = capacidadeMochila;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    private double capacidadeMochila;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public AlgoritmoGenetico(int numeroGeracoes, int tamanhoPopulacao,
            int probabilidadeMutacao, int quantidadeCruzamento,
            double capacidadeMochila) {
        this.numeroGeracoes = numeroGeracoes;
        this.tamanhoPopulacao = tamanhoPopulacao;
        this.probabilidadeMutacao = probabilidadeMutacao;
        this.quantidadeCruzamento = quantidadeCruzamento;
        this.capacidadeMochila = capacidadeMochila;
    }

    public void carregaArquivo(String fileName) {
        String line = "";
        String[] produto = null;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                produto = line.split(",");
                Produto novoProduto = new Produto();
                novoProduto.setDescricao(produto[0]);
                novoProduto.setPeso(Double.parseDouble(produto[1]));
                novoProduto.setValor(Double.parseDouble(produto[2]));
                produtos.add(novoProduto);
            }
            this.tamanhoCromossomo = produtos.size();
            System.out.println("Total de produtos carregados: " + produtos.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
