package br.com.fiap.simulador.app;


import br.com.fiap.simulador.model.Partida;
import br.com.fiap.simulador.model.Time;

public class Quadrangular {
    public static void main(String[] args) {
        Time corinthians = new Time("Corinthians");
        Time santos = new Time("Santos");
        Time saoPaulo = new Time("Sao Paulo");
        Time guarani = new Time("Guarani da Capital");

        Partida p1 = new Partida(corinthians, guarani);
        p1.simulaPartida();
        System.out.println(p1.mostraPartida());

        Partida p2 = new Partida(corinthians, santos);
        p2.simulaPartida();
        p2.mostraPartida();

        Partida p3 = new Partida(corinthians, saoPaulo);
        p3.simulaPartida();
        p3.mostraPartida();

        Partida p4 = new Partida(santos, saoPaulo);
        p4.simulaPartida();
        p4.mostraPartida();

        Partida p5 = new Partida(santos, guarani);
        p5.simulaPartida();
        p5.mostraPartida();

        Partida p6 = new Partida(saoPaulo, guarani);
        p6.simulaPartida();
        p6.mostraPartida();

        System.out.println(corinthians.getNome() + " " + corinthians.getPontos());
        System.out.println(santos.getNome() + " " + santos.getPontos());
        System.out.println(saoPaulo.getNome() + " " + saoPaulo.getPontos());
        System.out.println(guarani.getNome() + " " + guarani.getPontos());
    }
}
