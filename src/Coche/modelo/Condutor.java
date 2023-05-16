package Coche.modelo;

public class Condutor {
    public IVehiculo buga;

    public Condutor(IVehiculo iv){
        this.buga = iv;
    };
    public String conducir(){
       return this.buga.moverse();
    }
}
