// @author Omar Cab

public class Controladora {
    public static void main(String[] args) {
        new Thread(new Reloj()).start();
        new Thread(new Ejecutor("calc", 5)).start();
    }
}
