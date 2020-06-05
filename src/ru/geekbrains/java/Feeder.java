package ru.geekbrains.java;

import java.util.Random;

public class Feeder
{
    private int new_food;

    public Feeder (int new_food)
    {
        this.new_food = new_food;
    }

    public void increaseFood (int addition)
    {
        addition = random.nextInt (25-35);
    }

    public void  newFeedInfo ()
    {
        System.out.println ("Кормильный аппарат выдал случайное количество еды: " + this.new_food);
    }

    private static Random random = new Random();
}
