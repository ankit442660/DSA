import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India", 120);
        map.put("China", 160);
        map.put("Japan", 30);
        System.out.println(map);
        map.put("China", 180);
        System.out.println(map);
        if(map.containsKey("India")){
            System.out.println("this key present in map");
        }else{
            System.out.println("This key does not present in Map");
        }
        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesia"));

        for( Map.Entry< String, Integer> e: map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());

        }
        Set<String> keys=map.keySet();
        for(String key : keys){
            System.err.println( key +" "+map.get(key));
        }
        map.remove("China");
        System.out.println(map);




    }
    
}
