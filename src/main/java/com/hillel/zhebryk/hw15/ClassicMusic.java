package com.hillel.zhebryk.hw15;

public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    void PlayMusic() {
        System.out.println("Pam pararam pararam pam pam");
    }
}
