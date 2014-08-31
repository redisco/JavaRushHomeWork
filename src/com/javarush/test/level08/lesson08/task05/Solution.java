package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","1");
        map.put("5","1");
        map.put("6","2");
        map.put("7","2");
        map.put("8","4");
        map.put("9","5");
        map.put("10","1");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            String firstName = pair.getValue();
            int i=0;

            for (Map.Entry<String, String> pair2: copy.entrySet()){
                if (firstName.equals(pair2.getValue())) i++;
            }



            if (i>1) removeItemFromMapByValue(map, firstName);
        }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }


}
