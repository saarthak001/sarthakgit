/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

/**
 *
 * @author Sarthak
 */
  class Task1 extends Thread{
	public void run(){
		for(int i =0;i<10;i++){
			System.out.println("hello");
		}
        }  
        
        
    
}
 class Task2 implements Runnable{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println("sarthak");
		}
        }  
}
class Task3 extends Thread{
	public void run(){
		for(int i=0;i< 30;i++){
			System.out.println("i am here");
		}
        }  
}
