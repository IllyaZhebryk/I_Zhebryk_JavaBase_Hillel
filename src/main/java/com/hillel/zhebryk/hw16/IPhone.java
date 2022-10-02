package com.hillel.zhebryk.hw16;

public class IPhone implements Smartfones, IOs {
    String name;

    public IPhone(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("Dong-dong");
    }

    @Override
    public void sms() {
        System.out.println("Let's dance! It's a message for you!");
    }

    ;

    @Override
    public void internet() {
        System.out.println("You can surf!");
    }

    ;
}
