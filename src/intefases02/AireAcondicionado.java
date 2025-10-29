
package intefases02;


public class AireAcondicionado extends Electrodomestico {
    
        public AireAcondicionado(String marca, int consumo){
        
        super(marca, consumo);
    }
      @Override
    public void encerder() {
         super.encendido = true;
        System.out.println("El AireAcondicionado esta encendido");
    }
    
    @Override
    public void apagar(){
        super.encendido = false;
        System.out.println("El AireAcondicionado esta apagado");
    }
    @Override
    public void configurar(String modo){
        if(encendido){
            System.out.println("El AireAcondicionado se configuro en modo: " + modo);
        }
    }
    public void cambiarTemperatura(int grados){
        if(encendido){
            System.out.println("El aire acondicionado ahora esta en "+ grados + " grados ");
        }
    }
}
