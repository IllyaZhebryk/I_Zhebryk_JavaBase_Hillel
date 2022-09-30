package com.hillel.zhebryk.hw15;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] artists = {
                new PopMusic("Abba"),
                new RockMusic("Europe"),
                new ClassicMusic("Mozart"),
        };
        for (MusicStyles artist : artists) {
            artist.PlayMusic();
            artist.doWithUs();
        }

    }
}

