package com.hillel.zhebryk.hw15;


public abstract class MusicStyles {
    protected String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    abstract void PlayMusic();

    void doWithUs() {
        System.out.println("Sing with us! Hands up! Clap-clap-clap!");
    }
}
