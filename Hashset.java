import java.util.HashSet;
import java.util.Iterator;


public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> h1=new HashSet<>();
        h1.add(1);
        h1.add(2);
        h1.add(3);
        h1.add(1);
        System.out.println(h1);
        System.out.println(h1.size());

        Iterator it=h1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //search
        // if(h1.contains(1)){
        //     System.out.println("Element Contains");
        // }
        // if(!h1.contains(5)){
        //     System.out.println("Element does not contains");
        // }
//remove
        // h1.remove(1);
        // if(!h1.contains(1)){
        //     System.out.println("Element doesn't Contains");
        // }
    }
    
}
