package ru.geekbrains.java;

public class Plate
{
    private int food;

    public Plate (int food)
    {
        this.food = food;
    }

    public void info()
    {
        System.out.println("Осталось еды: " + food);
    }

    public void decreaseFood(int appetite)
    {
        if(!hasEnoughFood(appetite))
        {
            System.out.println("Не хватает еды в мисочке");
            return;
        }
        else
            food = food - appetite;
    }

    public void autoFeederOn()
    {
        this.food += food;
    }

    public boolean hasEnoughFood(int appetite)
    {
        return appetite <= food;
    }

    public int getFood()
    {
        return food;
    }
}

