package volador.presentacion;

import volador.modelo.Ave;
import volador.modelo.Avion;
import volador.modelo.ObjetoVolador;
import volador.modelo.Superman;

public class main {
    ObjetoVolador ave = new Ave();
    ObjetoVolador avi = new Avion();
    ObjetoVolador superman = new Superman();

    ObjetoVolador[] voladors = {new Ave(),new Avion(),new Superman()};

    for(ObjetoVolador volador: voladors){
        System.out.println("********************************");
        System.out.println(volador.despegar());
        System.out.println(volador.volar());
        System.out.println(volador.aterrizar());

        if (volador instanceof Ave){
            System.out.println(((Ave) volador).hacerNido());
            System.out.println(((Ave) volador).ponerHuevo());

        } else if (volador instanceof Superman) {
            System.out.println(((Superman) volador).saltarEdificio());
            System.out.println(((Superman) volador).pararBala());

        }
    }
}
