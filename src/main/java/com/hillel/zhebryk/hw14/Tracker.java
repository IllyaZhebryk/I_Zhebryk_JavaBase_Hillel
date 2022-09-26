package com.hillel.zhebryk.hw14;

public class Tracker {
    final String name;
    final int birthDay;
    final String birthMonth;
    final int birthYear;
    final String mail;
    final String phoneNumber;
    String surname;
    double weight;
    String pressure;
    int steps;
    int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public Tracker(String name, int birthDay, String birthMonth, int birthYear, String mail, String phoneNumber, String surname, double weight, String pressure, int steps) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = 2020 - birthYear;
    }

    void printAccountInfo() {
        System.out.println("Ім'я: " + getName());
        System.out.println("Прізвище " + getSurname());
        System.out.println("Дата народження: " + getBirthDay() + " " + getBirthMonth() + " " + getBirthYear() + "р.");
        System.out.println("Вік, повних років: " + getAge());
        System.out.println("E-mail: " + getMail());
        System.out.println("Контактний номер телефону: " + getPhoneNumber());
        System.out.println("Вага, кг: " + getWeight());
        System.out.println("Тиск, мм.рт.ст.: " + getPressure());
        System.out.println("Кількість кроків за день: " + getSteps());
        System.out.println();
    }

}

