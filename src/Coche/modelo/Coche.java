package Coche.modelo;

public class Coche  implements IVehiculo{
    public int deposito = 10;
    @Override
    public String moverse() {
        if(deposito >0){
            deposito--;
            return ("El coche se ha movido");
        }
        return "";
    }
}
