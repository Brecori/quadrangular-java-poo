package br.com.fiap.simulador.app;

import br.com.fiap.simulador.model.Partida;
import br.com.fiap.simulador.model.Time;

public class Quadrangular2 {
    public static void main(String[] args) {
        String[] nomes = {"Corinthians", "Sao Paulo", "Santos", "Guarani da Capital"};
        Time[] times = new Time[nomes.length];

        for (int i = 0; i < nomes.length; i++) {
            times[i] = new Time(nomes[i]);
        }

        Partida[] partidas = new Partida[6];
        int j = 0;

        for (int k = 0; k < times.length; k++) {
            Time aux = times[k];

            for (int i = k + 1; i < times.length; i++) {
                partidas[j] = new Partida(aux, times[i]);
                j++;
            }
        }

        for(Partida p: partidas) {
            p.simulaPartida();
            System.out.println(p.mostraPartida());
        }







    }
}
