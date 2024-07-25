package Esercitazione;

import interfaces.Worker;

import java.util.Date;

public class Volontario implements Worker {
    private String nome;
    private int eta;
    private boolean cv;


    public Volontario(String nome, int eta, boolean cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;

    }

    @Override
    public void checkIn() {
        System.out.println("Orario check.in" + new Date());
    }
}
