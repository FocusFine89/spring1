package com.example.spring1.entities;

import java.util.List;

public class Menu {
    //Atrributi
    private List<Pizze> listaPizze;
    private List<Toppings> listaToppings;
    private List<Bevande> listaBevande;

    //Costruttori

    public Menu(List<Pizze> listaPizze, List<Toppings> listaToppings, List<Bevande> listaBevande) {
        this.listaPizze = listaPizze;
        this.listaToppings = listaToppings;
        this.listaBevande = listaBevande;
    }

    //Metodi

    public List<Pizze> getListaPizze() {
        return listaPizze;
    }

    public void setListaPizze(List<Pizze> listaPizze) {
        this.listaPizze = listaPizze;
    }

    public List<Toppings> getListaToppings() {
        return listaToppings;
    }

    public void setListaToppings(List<Toppings> listaToppings) {
        this.listaToppings = listaToppings;
    }

    public List<Bevande> getListaBevande() {
        return listaBevande;
    }

    public void setListaBevande(List<Bevande> listaBevande) {
        this.listaBevande = listaBevande;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "listaPizze=" + listaPizze +
                ", listaToppings=" + listaToppings +
                ", listaBevande=" + listaBevande +
                '}';
    }
}
