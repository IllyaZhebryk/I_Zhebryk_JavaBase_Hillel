package com.hillel.zhebryk.hw14;

public class Main {
    public static void main(String[] args) {
        Tracker fiton1 = new Tracker("John", 12, "May", 1995, "jonny@jhg.fg", "0980807987", "Dou", 68.5, "120/80", 0);
        Tracker fiton2 = new Tracker("Johny", 15, "April", 1956, "jc@jhg.com", "098012367", "Smit", 103.3, "150/100", 0);
        Tracker fiton3 = new Tracker("Mary", 31, "Febraury", 1944, "paradise@jhg.fg", "-", "Monroe", 50, "90/60", 0);
        fiton1.printAccountInfo();
        fiton2.printAccountInfo();
        fiton3.printAccountInfo();
        fiton2.setSurname("Smith");
        fiton1.setSteps(150);
        fiton3.setWeight(49.9);
        fiton2.setPressure("130/90");
        fiton1.printAccountInfo();
        fiton2.printAccountInfo();
        fiton3.printAccountInfo();

    }
}
