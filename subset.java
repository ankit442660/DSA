import java.util.ArrayList;

public class subset {
public static void printsubset(ArrayList<Integer> subset){
    for(int i=0;i<subset.size();i++){
        System.out.println(subset.get(i)+" ");
    }
    System.out.println();
}
public static void findsubset(int m, ArrayList<Integer> subset){
if(m==0){
    printsubset(subset);
    return;
        }

        findsubset(m-1, subset);
        subset.add(m);
        findsubset(m-1, subset);
        subset.remove(subset.size()-1);

}
    public static void main(String[] args) {
        findsubset(3, new ArrayList<Integer> ());
    }
    
}
