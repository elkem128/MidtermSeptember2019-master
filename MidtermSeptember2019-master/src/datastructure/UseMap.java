package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        List<String> cityOfUSA = new ArrayList<String>();
        cityOfUSA.add("LOS ANGELES");
        cityOfUSA.add("BOSTON");
        cityOfUSA.add("CHICAGO");

        List<String> cityOfItaly = new ArrayList<String>();
        cityOfItaly.add("Rome");
        cityOfItaly.add("Milan");
        cityOfItaly.add("Venice");

        List<String>   cityOfSpain= new ArrayList<String>();
        cityOfSpain.add("Madrid");
        cityOfSpain.add("Barcelona");
        cityOfSpain.add("Palma");

        Map<String,List<String>> map = new HashMap<String,List<String>>();

        map.put("USA" ,cityOfUSA);
        map.put("ITALY",cityOfItaly);
        map.put("SPAIN" ,cityOfSpain);
        for(Map.Entry<String , List<String>>   m : map.entrySet()){
            System.out.println(m.getKey()  + "  " + m.getValue());
        }
        System.out.println("Using while loop ************* ");

        Iterator<Map.Entry<String , List<String>>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry  value = it.next();
            System.out.println(value.getKey());
            System.out.println(value.getValue());
        }
    }

}
