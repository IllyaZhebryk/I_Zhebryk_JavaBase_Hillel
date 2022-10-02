package com.hillel.zhebryk.hw16;

public class Androids implements Smartfones, LinuxOS {
    String name;

    public Androids(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("Ding-ding");
    }

    @Override
    public void sms() {
        System.out.println("You've got a message!");
    }

    @Override
    public void internet() {
        System.out.println("You're online.");
    }
}
