package br.com.fiap.simulador.model;

import java.util.Random;

public class Partida {
    private Time casa;
    private Time visitante;
    private int golsCasa;
    private int golsVisitante;

    public Partida(Time casa, Time visitante) {
        this.casa = casa;
        this.visitante = visitante;
    }

    public void simulaPartida() {
        Random r = new Random();
        this.golsCasa = r.nextInt(6);
        this.golsVisitante = r.nextInt(6);

        if (this.golsCasa > this.golsVisitante) {
            this.casa.addPontos(3);
        }
        else if (this.golsCasa < this.golsVisitante) {
            this.visitante.addPontos(3);
        }
        else {
            this.casa.addPontos(1);
            this.visitante.addPontos(1);
        }
    }

    public String mostraPartida() {
        //return casa.getNome() + " " + golsCasa + " X " + golsVisitante + " " + visitante.getNome();
        return String.format("%s %d X %d %s", casa.getNome(), golsCasa, golsVisitante, visitante.getNome());
    }
}
