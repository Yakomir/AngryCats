package ru.geekbrains.java;

public class Cat
{
    private String name;
    private int appetite;

//    3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
//    Если коту удалось покушать (хватило еды), сытость = true
    private boolean isFull;

    public Cat (String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
    }

    private String eat_info;
    public void eatFrom (Plate plate)
    {
        if (plate.hasEnoughFood(appetite) && !isFull)
        {
            plate.decreaseFood(appetite);
            isFull = true;
            System.out.println(name + " покушал " + appetite);
        }
        else if (isFull)
        {
            System.out.println(name + " не голодный.");
        }
        else
        {
            System.out.println("Не хватило еды в мисочке для " + name);
        }
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
