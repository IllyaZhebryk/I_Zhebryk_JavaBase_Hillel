package com.hillel.zhebryk.hw17;

public enum DrinksMachine {
    TEA("Чай"),
    COFFEE("Кава"),
    LEMONADE("Лимонад"),
    MOJITO("Мохіто"),
    MINERAL_WATER("Мінеральна вода"),
    COCA_COLA("Кока-Кола");
    private String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
