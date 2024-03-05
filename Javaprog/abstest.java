abstract class animal{
	abstract void eat();
}
class Dog extends animal{
	void eat(){
	System.out.println("eating");
}
}
public class abstest{
	public static void main(String[]args){
	Dog D=new Dog();
	D.eat();
	}
}