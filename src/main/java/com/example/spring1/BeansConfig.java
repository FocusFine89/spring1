package com.example.spring1;

import com.example.spring1.entities.Bevande;
import com.example.spring1.entities.Menu;
import com.example.spring1.entities.Pizze;
import com.example.spring1.entities.Toppings;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Configuration
public class BeansConfig {

        @Bean
        public Toppings getFunghi(){
            return new Toppings("Funghi", 0.50, "24 Kcal");
        }

        @Bean
        public Toppings getPomodoro(){
            return new Toppings("Pomodoro", 0.30, "29 Kcal");
        }

        @Bean
        public Toppings getCipolla(){
            return new Toppings("Cipolla", 0.30, "35 Kcal");
        }

        @Bean
        public Toppings getSalsiccia(){
            return new Toppings("Salsiccia", 1, "324 Kcal");
        }

        @Bean
        public Toppings getMozzarella(){
            return new Toppings("Mozzarella", 1, "250 Kcal");
        }

        @Bean
        public Toppings getSalame(){
            return new Toppings("Salame", 0.90, "412 Kcal");
        }



        @Bean
        public Pizze getPizzaMargherita(){
            return new Pizze("Margherita", 5, "700 kcal");
        }

    @Bean
    public Pizze getPizzaDiavola(){
        return new Pizze("Diavola", 6, "910 kcal");
    }

    @Bean
    public Pizze getPizzaCapricciosa(){
        return new Pizze("Capricciosa", 5, "1100 kcal");
    }

    @Bean
    public Pizze getPizzaMarinara(){
        return new Pizze("Marinara", 5, "950 kcal");
    }

    @Bean
    public Bevande getCoca(){
            return new Bevande("Coca Cola", "0.33l", 1, "42 Kcal");
    }

    @Bean
    public Bevande getSprite(){
        return new Bevande("Sprite", "0.33l", 1, "9 Kcal");
    }

    @Bean
    public Bevande getFanta(){
        return new Bevande("Fanta", "0.33l", 1, "48 Kcal");
    }


    //Definisco una lista di Topping
    @Bean
    public List<Toppings> listaToppings() {
        return Arrays.asList(getFunghi(), getCipolla(), getMozzarella(), getSalame(), getSalsiccia(), getPomodoro());
    }

    //Lista di pizze
    @Bean
    public List<Pizze> listaPizze(){
            return Arrays.asList(getPizzaMargherita(), getPizzaDiavola(), getPizzaCapricciosa(), getPizzaMarinara());
    }

    @Bean
    public List<Bevande> listaBevande(){
        return Arrays.asList(getCoca(), getFanta(), getSprite());
    }

    public Menu getMenu(List<Pizze> listaPizze, List<Toppings> listaToppings, List<Bevande> listaBevande) {
        return new Menu(listaPizze, listaToppings, listaBevande);
        }
}
