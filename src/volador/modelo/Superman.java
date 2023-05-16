package volador.modelo;

public class Superman implements ObjetoVolador{

    @Override
    public String despegar() {
       return("SUPERMAN despega");
    }

    @Override
    public String aterrizar() {return("SUPERMAN aterriza");
    }

    @Override
    public String volar() {
        return("SUPERMAN vuela");
    }

    public String saltarEdificio() {
        return("SUPERMAN salta un edificio");
    }

    public String pararBala() {
        return("SUPERMAN para una bala");
    }
}
