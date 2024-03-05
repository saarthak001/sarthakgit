
package multithread;


public class Multithread {

    
    public static void main(String[] args) {

        Task1 T1= new Task1();
        T1.start();
        Task2 T2= new Task2();
        Thread Th = new Thread(T2);
        Th.start();
        Task3 T3= new Task3();
        T3.start();
    }
    
}
