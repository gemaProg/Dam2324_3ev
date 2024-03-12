package org.example;

import net.datafaker.Faker;


public class Main {
    public static void main(String[] args) {

        System.out.println("------------------Baloncesto---------------------------");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(new Faker().basketball().positions());
        }
        System.out.println("----------------------POKEMON--------------------------");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(new Faker().pokemon().name());
        }
        System.out.println("---------------------HARRY POTTER----------------------");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(new Faker().harryPotter().book());
        }
        System.out.println("---------------Cómo entrenar a tu dragon------------------------------");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(new Faker().howToTrainYourDragon().characters());
        }
        System.out.println("---------------Big bang theory-----------------------------");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(new Faker().bigBangTheory().character());
        }
    }

}