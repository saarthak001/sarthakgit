interface Bike{
	void run();
	void changegear();
}
public class Honda2 implements Bike{
	public void run(){
	System.out.println("running");
	}
	public void changegear(){
	System.out.println("rideing");
	}
public static void main(String[]args){
	Bike B= new Honda2();
	B.run();
	B.changegear();
}
}