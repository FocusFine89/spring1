package com.example.spring1.entities;

import java.util.List;

public class Toppings {
    //Attributi
    private String nomeTopping;
    private double prezzo;
    private String valoriNutrizionali;



    //Costruttori
    public Toppings(String nomeTopping, double prezzo, String valoriNutrizionali) {
        this.nomeTopping = nomeTopping;
        this.prezzo = prezzo;
        this.valoriNutrizionali = valoriNutrizionali;
    }

    //Metodi

    public String getNomeTopping() {
        return nomeTopping;
    }

    public void setNomeTopping(String nomeTopping) {
        this.nomeTopping = nomeTopping;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getValoriNutrizionali() {
        return valoriNutrizionali;
    }

    public void setValoriNutrizionali(String valoriNutrizionali) {
        this.valoriNutrizionali = valoriNutrizionali;
    }

    @Override
    public String toString() {
        return nomeTopping + " " +
                valoriNutrizionali + " " + prezzo + " euro \n";
    }
}
