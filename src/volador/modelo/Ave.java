package volador.modelo;

public class Ave implements ObjetoVolador{
    @Override
    public String despegar() {
        return("El ave despega");
    }

    @Override
    public String aterrizar() {
        return("El ave despega");
    }

    @Override
    public String volar() {
        return("El ave despega");
    }
    public String hacerNido() {
        return("El ave hace un nido");
    }
    public String ponerHuevo() {
        return("El ave pone un huevo");
    }
}
