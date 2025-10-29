
package intefases02;

import java.util.ArrayList;
import java.util.Iterator;


public class Hogar implements Iterable <Electrodomestico>{
    
    private ArrayList<Electrodomestico> electrodomesticos;

    public Hogar(ArrayList<Electrodomestico> electrodomesticos) {
        this.electrodomesticos = electrodomesticos;
    }

    public ArrayList<Electrodomestico> getElectrodomesticos() {
        return new ArrayList<Electrodomestico> (this.electrodomesticos);
    }

    @Override
    public Iterator<Electrodomestico> iterator() {
        
        return electrodomesticos.listIterator();
        
        
    }
    
    
    
        
    }
    
    

