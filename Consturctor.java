/**
 * InnerConsturctor
 */
 class InnerConsturctor {

public InnerConsturctor(){
        System.out.println("Consturctor activated");
    }
}


public class Consturctor {
    public static void main(String[] args) {
      InnerConsturctor i=new InnerConsturctor();  
    }
    
}
