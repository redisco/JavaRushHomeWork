package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций
(быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List  getListForGet()
    {
        //Напишите тут ваш код
        return new ArrayList<Object>();
    }

    public static List  getListForSet()
    {
        //Напишите тут ваш код
        return new ArrayList<Object>();
    }

    public static List  getListForAddOrInsert()
    {
        //Напишите тут ваш код
        return new LinkedList<Object>();
    }

    public static List  getListForRemove()
    {
        //Напишите тут ваш код
        return new LinkedList<Object>();
    }
}
