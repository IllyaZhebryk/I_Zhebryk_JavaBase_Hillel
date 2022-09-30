package com.hillel.zhebryk.hw15;

public class RockMusic extends MusicStyles {
    public RockMusic(String name) {
        super(name);
    }

    @Override
    void PlayMusic() {
        System.out.println("It`s a final countdown!");
    }
}
