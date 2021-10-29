package Main;

import Clases.Hilo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int numeringo = 1;
        List<Thread> hilingos = new ArrayList<Thread>();
        for (int i = 1; i < 21; i++) {
            Thread hilo = new Thread(new Hilo(numeringo));
            numeringo++;
            hilingos.add(hilo);
        }
        for (Thread hilo : hilingos) {
            hilo.start();
        }

        for (Thread hilo : hilingos) {
            hilo.interrupt();

        }
    }

}
