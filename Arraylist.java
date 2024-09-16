import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(1,3);
        list.set(0, 1);
        list.remove(0);
        
        for (int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.add(4);
        Collections.sort(list);
        System.out.println(list);
    }
}
