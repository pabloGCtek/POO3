package taller.presentacion;

import taller.modelo.Coche;
import taller.modelo.SeguroCoche;
import taller.modelo.TallerMecanico;
import taller.modelo.TallerPintura;

public class Main {
    public static void main(String[] args) {
         Coche c = new Coche();
         TallerMecanico m = new TallerMecanico();
        TallerPintura p = new TallerPintura();
        SeguroCoche seguroM = new SeguroCoche(m);
        SeguroCoche seguroP = new SeguroCoche(p);
        System.out.println(seguroM.taller.reparar(c));
        System.out.println(seguroP.taller.reparar(c));

    }

}
