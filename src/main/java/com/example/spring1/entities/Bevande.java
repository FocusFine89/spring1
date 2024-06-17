package com.example.spring1.entities;

public class Bevande {
    //Attributi
    private String nomeBevanda;
    private String quantita;
    private double prezzo;
    private String valoriNutrizionali;


    //Costruttori

    public Bevande(String nomeBevanda, String quantita, double prezzo, String valoriNutrizionali) {
        this.nomeBevanda = nomeBevanda;
        this.quantita = quantita;
        this.prezzo = prezzo;
        this.valoriNutrizionali = valoriNutrizionali;
    }


    //Metodi

    public String getNomeBevanda() {
        return nomeBevanda;
    }

    public void setNomeBevanda(String nomeBevanda) {
        this.nomeBevanda = nomeBevanda;
    }

    public String getQuantita() {
        return quantita;
    }

    public void setQuantita(String quantita) {
        this.quantita = quantita;
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
        return nomeBevanda + " (" + quantita + ") " +
                valoriNutrizionali + " " + prezzo + "euro \n";
    }
}
