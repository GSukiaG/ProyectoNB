

public class Barbero extends Thread {
    private GestorSillas gs;

    public Barbero(GestorSillas gestorSillas){
        this.gs=gestorSillas;
    }

    public GestorSillas getGestorSillas() {
        return gs;
    }

    public void setGestorSillas(GestorSillas gestorSillas) {
        this.gs = gestorSillas;
    }

    @Override
    public void run() {

    }
}
