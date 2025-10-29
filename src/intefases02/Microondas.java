
package intefases02;


public class Microondas extends Electrodomestico {
    
    public Microondas(String marca, int consumo){
        
        super(marca, consumo);
    }
      @Override
    public void encerder() {
         super.encendido = true;
        System.out.println("El microondas esta encendido");
    }
    
    @Override
    public void apagar(){
        super.encendido = false;
        System.out.println("El microondas esta apagado");
    }
    @Override
    public void configurar(String modo){
        if(encendido){
            System.out.println("El microondas se configuro en modo: " + modo);
        }
    }
    public void calentarPlato(){
        if(encendido){
            System.out.println("Calentando el plato");
        }
    }

  

}
