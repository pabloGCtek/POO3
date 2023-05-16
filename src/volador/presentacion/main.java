package volador.presentacion;

import volador.modelo.*;

public class Main {
    ObjetoVolador ave = new Ave();
    ObjetoVolador avi = new Avion();
    ObjetoVolador superman = new Superman();

    static ObjetoVolador[] voladors = {new Ave(),new Avion(),new Superman()};

    static Nautico[] nauticos = {new Barcaza(), new HidroAvion()};
    public static void main(String[] args){
        /*
        for(ObjetoVolador volador: voladors){
            System.out.println("********************************");
            System.out.println(volador.despegar());
            System.out.println(volador.volar());
            System.out.println(volador.aterrizar());

            if (volador instanceof Ave) {
                System.out.println(((Ave) volador).hacerNido());
                System.out.println(((Ave) volador).ponerHuevo());
                System.out.println(((Ave) volador).comer());


            } else if (volador instanceof Superman) {
                System.out.println(((Superman) volador).saltarEdificio());
                System.out.println(((Superman) volador).pararBala());
                System.out.println(((Superman) volador).comer());
            }
        }*/

        for(Nautico hidro: nauticos){
            System.out.println("********************************");
            System.out.println(hidro.navegar());
            System.out.println(hidro.atracar());

            if (hidro instanceof HidroAvion) {
                System.out.println(((HidroAvion) hidro).despegar());
                System.out.println(((HidroAvion) hidro).volar());
                System.out.println(((HidroAvion) hidro).aterrizar());

            }
        }
    }

}
