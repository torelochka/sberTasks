package ru.sber.zheleznov.task3.zoo;

import ru.sber.zheleznov.task3.animal.Animal;
import ru.sber.zheleznov.task3.animal.Cat;
import ru.sber.zheleznov.task3.animal.Monkey;
import ru.sber.zheleznov.task3.interfaces.Huntable;

public class Zoo {
    public static void main(String[] args) {
        Animal monkey = new Monkey();
        monkey.move();
        Huntable cat = new Cat();
        cat.hunt();
    }
}
