package br.com.fiap.simulador.model;

public class Time {
    private String nome;
    private int pontos;

    public Time(String nome) {
        this.nome = nome;
        this.pontos = 0;
    }

    public void addPontos(int qtd) {
        this.pontos = this.pontos + qtd;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

}
