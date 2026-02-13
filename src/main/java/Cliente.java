
public class Cliente extends Thread{
    private GestorSillas gs;

    public Cliente(GestorSillas gestorSillas) {
        this.gs = gestorSillas;
    }

    public GestorSillas getGestorSillas() {
        return gs;
    }

    public void setGestorSillas(GestorSillas gestorSillas) {
        this.gs = gestorSillas;
    }

    @Override
    public void run() {
        try {
            int silla;
        synchronized(gs){    
            if ((silla = gs.getSillaLibre()) > -1) {
                System.out.println(gs.getLibres()[silla]);
                wait();

            } else {
                System.out.println("El cliente se va");
            }
        }
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
