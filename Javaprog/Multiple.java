class Animal{
   public void eat()
    {
     System.out.println("eating");
    }
}
class Humanbeing{
   public void eat1(){
    System.out.println("eating");
    }
}
class man extends Animal,Humanbeing{
   public void run(){
    System.out.println("running");
    }
}
public class Multiple{
 public static void main(String[] args){
     man E=new man();
     E.eat();
     E.eat1();
     E.run();
    }
}