

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;

public class Peluqueria {
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        boolean[] libres = new boolean[4];
        Arrays.fill(libres, true);

        boolean[] atendido = new boolean[4];
        GestorSillas gs = new GestorSillas(libres,atendido);

        Barbero b1 = new Barbero(gs);
        Barbero b2 = new Barbero(gs);

        for (int i = 0; i<30; i++){
            Thread.sleep(r.nextInt(1000,10000)+1);
            Cliente c = new Cliente(gs);
            c.start();
        }

    }
}
