
package intefases02;

public class Lavarropas extends Electrodomestico {
       public Lavarropas(String marca, int consumo){
        
        super(marca, consumo);
    }
      @Override
    public void encerder() {
         super.encendido = true;
        System.out.println("El lavaropas esta encendido");
    }
    
    @Override
    public void apagar(){
        super.encendido = false;
        System.out.println("El lavaropas esta apagado");
    }
    @Override
    public void configurar(String modo){
        if(encendido){
            System.out.println("El lavaropas se configuro en modo: " + modo);
        }
    }
    public void iniciarLavado(){
        if(encendido){
            System.out.println("El lavarropas esta lavando  ");
        }
    }
}
