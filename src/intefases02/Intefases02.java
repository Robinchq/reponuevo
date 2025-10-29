
package intefases02;

import java.util.ArrayList;
import java.util.Collections;



public class Intefases02 {
    
    

    public static void main(String[] args) {
        
        Microondas m1 = new Microondas("GL", 100);
        AireAcondicionado a1 = new AireAcondicionado("GL",50);
        Lavarropas l1 = new Lavarropas ("Whrie", 150);
        Microondas m2 = new Microondas("HHH", 100);
        AireAcondicionado a2 = new AireAcondicionado("KK", 23);
        Lavarropas l2 = new Lavarropas ("GOOGLE", 150);
        ArrayList <Electrodomestico> electrodomesticos = new ArrayList <> ();
        
        electrodomesticos.add(l1);
        electrodomesticos.add(m1);
        electrodomesticos.add(a1);
        electrodomesticos.add(l2);
        electrodomesticos.add(m2);
        electrodomesticos.add(a2);
        
        Collections.sort(electrodomesticos);
        
        Hogar h1 = new Hogar(electrodomesticos);
        
        for (Electrodomestico item : h1) {
            
            System.out.println(item);
            System.out.println("--------------------------");
        }
    }
    
    
}
