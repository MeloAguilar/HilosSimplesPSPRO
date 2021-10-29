package Clases;

public class Hilo implements Runnable{
    int numeroHilo;
    public Hilo(int numeroHilo){
        this.numeroHilo = numeroHilo;
    }

    @Override
    synchronized public void run() {
        while(!Thread.currentThread().isInterrupted()){

                        //.wait(10000);
                System.out.printf("Calculo hilo %s realizado.\n", this.numeroHilo);




        } System.out.printf("Hilo %s interrumpido.\n", this.numeroHilo);

    }
}
