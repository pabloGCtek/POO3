package volador.modelo;

public class Superman extends Kriptoniano implements ObjetoVolador{

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

    @Override
    public String comer() {
        return("SUPERMAN come");
    }

    public String saltarEdificio() {
        return("SUPERMAN salta un edificio");
    }

    public String pararBala() {
        return("SUPERMAN para una bala");
    }


}
