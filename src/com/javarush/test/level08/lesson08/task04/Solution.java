package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Сталлоне2", new Date("MAY 1 1981"));
        map.put("Сталлоне3", new Date("SEPTEMBER 1 1982"));
        map.put("Сталлоне4", new Date("JULY 1 1983"));
        map.put("Сталлоне5", new Date("DECEMBER 1 1984"));
        map.put("Сталлоне6", new Date("MARCH 1 1985"));
        map.put("Сталлоне7", new Date("JUNE 1 1986"));
        map.put("Сталлоне8", new Date("AUGUST 1 1987"));
        map.put("Сталлоне9", new Date("JUNE 1 1988"));
        map.put("Сталлоне10", new Date("JANUARY 1 1989"));

        //Напишите тут ваш код
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String,Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,Date> entry = iter.next();
            if(entry.getValue().getMonth()>4&&entry.getValue().getMonth()<8){
                iter.remove();
            }
        }


    }

//    public static void main(String[] args)
//    {
//        HashMap<String,Date> testMap = createMap();
//        System.out.println("Before deleting" + testMap);
//        removeAllSummerPeople(testMap);
//        System.out.println("After deleting" + testMap);
//    }
}
