package ru.sber.zheleznov.task3.animal;

import ru.sber.zheleznov.task3.interfaces.Huntable;
import ru.sber.zheleznov.task3.interfaces.Voiceable;

public class Monkey extends Animal implements Huntable, Voiceable {

    @Override
    public void hunt() {
        System.out.println("monkey hunt");
    }

    @Override
    public void voice() {
        System.out.println("monkey sound");
    }
}
