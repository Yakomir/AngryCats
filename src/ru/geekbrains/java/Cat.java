package ru.geekbrains.java;

public class Cat
{
    private String name;
    private int appetite;
    public String eat_info;

    public Cat (String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
    }

    public void eatFrom (Plate plate)
    {
        plate.decreaseFood(appetite);
    }

    public void eatInfo (Plate plate)
    {
        String eat_info = this.appetite <= plate.getFood() ? this.name + " скушал " + this.appetite : this.name + " не поел, еда закончилась";

        System.out.println(eat_info);

//        if(this.appetite <= plate.getFood())
//        {
//            System.out.println(this.name + " скушал " + this.appetite);
//        }
//        if (this.appetite > plate.getFood())
//        {
//            System.out.println(this.name + " не поел, еда закончилась.");
//        }


    }


}
