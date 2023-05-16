package taller.modelo;

public class TallerPintura implements ITaller{
    @Override
    public String reparar(Coche c) {
        return "Coche reparado en taller Pintura";
    }
}
