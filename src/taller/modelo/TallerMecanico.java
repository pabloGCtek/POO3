package taller.modelo;

import taller.modelo.Coche;
import taller.modelo.ITaller;

public class TallerMecanico implements ITaller {
    @Override
    public String reparar(Coche c) {
        return "Coche reparado en taller mecanico";
    }
}
