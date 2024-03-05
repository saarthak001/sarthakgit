
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarthak
 */
public class Testjoin {
    public static void main(String[]args) {
        Task1 T1= new Task1();
        T1.start();
        try{T1.join();
        }catch{
            System.out.println("xyz")
        }
        Task2 T2 = new Task2();
        Thread Th = new Thread((Runnable) T2);
        Th.start();
        try {
            Th.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Testjoin.class.getName()).log(Level.SEVERE, null, ex);
        }
        Task3 T3= new Task3();
        T3.start();
        T3.join();
        
    }

    private static class Task3 {

        public Task3() {
        }

        private void join() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void start() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
