package pkg8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Runnable interruptedRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    try {
                        System.out.println("Thread1 " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        Runnable interruptedRunnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println("Thread2 " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        Runnable interruptedRunnable3 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++) {
                    try {
                        System.out.println("Thread3 " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        Thread thread1 = new Thread(interruptedRunnable);
        Thread thread2 = new Thread(interruptedRunnable2);
        Thread thread3 = new Thread(interruptedRunnable3);
        thread1.start();
        Thread.sleep(1000);
        thread2.start();
        Thread.sleep(1000);
        thread3.start();
        Thread.sleep(1000);
    }

}
