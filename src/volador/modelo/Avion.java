package volador.modelo;

public class Avion extends Vehiculo implements ObjetoVolador{
    @Override
    public String despegar() {
        return("El avion despega");
    }

    @Override
    public String aterrizar() {
        return("El avion despega");
    }

    @Override
    public String volar() {
        return("El avion despega");
}
}
