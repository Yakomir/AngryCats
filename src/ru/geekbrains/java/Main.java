package ru.geekbrains.java;



public class Main
{
    public static void main (String [] args)
    {
        Cat cat1 = new Cat("Muzik",6);
        Cat cat2 = new Cat("Puzik",7);
        Cat cat3 = new Cat("Ruzik",8);

        Cat all_cats [] = {cat1,cat2,cat3};

        Plate plate = new Plate(15);

        plate.info();
        System.out.println();

        for (int i = 0; i < all_cats.length; i++)
        {
            all_cats[i].eatFrom(plate);
//          all_cats[i].eatInfo(plate);
        }

        System.out.println();
        plate.info();

    }


}
