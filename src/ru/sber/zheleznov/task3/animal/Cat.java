package ru.sber.zheleznov.task3.animal;

import ru.sber.zheleznov.task3.interfaces.Huntable;
import ru.sber.zheleznov.task3.interfaces.Voiceable;

public class Cat extends Animal implements Huntable, Voiceable {

    @Override
    public void hunt() {
        System.out.println("Cat hunt");
    }

    @Override
    public void voice() {
        System.out.println("miaow");
    }
}
