
public class GestorSillas {
    private boolean[] libres;
    private boolean[] atentido;


    public synchronized int getSillaLibre() {
        for (int i = 0; i < libres.length; i++) {
            if (libres[i]) {
                libres[i] = false;
                return i;
            }
        }
        return -1;
    }
    public synchronized void asignarCliente() throws InterruptedException {
        for (int i = 0; i < libres.length; i++) {
            if (!atentido[i]) {
                atentido[i] = true;
                notify();
                corte();
                break;
            }
        }
        wait();
    }
    private void corte() throws InterruptedException {
        Thread.sleep(10000);
    }
    public GestorSillas(boolean[] libres, boolean[] atentido) {
        this.libres = libres;
        this.atentido = atentido;
    }

    public boolean[] getLibres() {
        return libres;
    }

    public void setLibres(boolean[] libres) {
        this.libres = libres;
    }

    public boolean[] getAtentido() {
        return atentido;
    }

    public void setAtentido(boolean[] atentido) {
        this.atentido = atentido;
    }

}
