package com.hillel.zhebryk.hw13;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String salade;
    String mayonneise;
    boolean doubleMeat;

    public Burger(String bun, String meat, String cheese, String salade, String mayonneise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salade = salade;
        this.mayonneise = mayonneise;
        System.out.println("Склад бургеру: " + this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.salade + ", " + this.mayonneise + ".");
    }

    public Burger(String bun, String meat, String cheese, String salade) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salade = salade;
        System.out.println("Склад бургеру: " + this.bun + ", " + this.meat + ", " + this.cheese + ", " + this.salade + ".");

    }

    public Burger(String bun, String meat, String cheese, String salade, String mayonneise, boolean doubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salade = salade;
        this.mayonneise = mayonneise;
        this.doubleMeat = true;
        System.out.println("Склад бургеру: " + this.bun + ", " + "Double " + this.meat + ", " + this.cheese + ", " + this.salade + ", " + this.mayonneise + ".");

    }
}
