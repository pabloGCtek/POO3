package Coche.presentacion;

import Coche.modelo.Coche;
import Coche.modelo.Condutor;

public class main {
    public static void main(String[] args) {
        Condutor c = new Condutor(new Coche());

        for (int i = 0; i <11;i++) {
            System.out.println(c.conducir());
        }
    }
}
