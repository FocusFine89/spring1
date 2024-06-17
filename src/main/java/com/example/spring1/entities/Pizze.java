package com.example.spring1.entities;

import java.util.List;

public class Pizze {
    //Attributi
    private String nomePizza;
    private double prezzo;
    private String valoriNutrizionali;
    private List<Toppings> toppings;

    //Costruttori
    public Pizze (){}

    public Pizze (String nomePizza, double prezzo, String valoriNutrizionali){
        this.nomePizza = nomePizza;
        this.prezzo = prezzo;
        this.valoriNutrizionali = valoriNutrizionali;

    }

    public Pizze(String nomePizza, double prezzo, String valoriNutrizionali, List<Toppings> toppings) {
        this.nomePizza = nomePizza;
        this.prezzo = prezzo;
        this.valoriNutrizionali = valoriNutrizionali;
        this.toppings = toppings;
    }


    //Metodi


    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
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

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nomePizza='" + nomePizza + '\'' +
                ", prezzo=" + prezzo +
                ", valoriNutrizionali='" + valoriNutrizionali + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
