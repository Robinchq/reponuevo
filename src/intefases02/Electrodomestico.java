
package intefases02;


public abstract class Electrodomestico implements Operable, Comparable <Electrodomestico> {
    protected String marca;
    protected int consumo;
    protected boolean encendido;
    
    public Electrodomestico(String marca, int consumo){
        this.marca = marca;
        this.consumo = consumo;
        this.encendido = false;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getConsumo() {
        return this.consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public boolean isEncendido() {
        return this.encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
     public void mostrarEstado(){
         
         if(encendido){
         System.out.println("El electrodomentico esta encendido");
         }
     }

    @Override
    public int compareTo(Electrodomestico electrodomestico) {
        int resultado;
        resultado = this.marca.compareTo(electrodomestico.marca);
        
        if (resultado == 0){
            
        resultado = Integer.compare(this.consumo, electrodomestico.consumo);
        }
        return resultado;
        
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "marca=" + marca + ", consumo=" + consumo + ", encendido=" + encendido + '}';
    }
    
}
