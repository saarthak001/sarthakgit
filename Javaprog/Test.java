class Animal{
   public void eat()
    {
     System.out.println("eating");
    }
}
class Dog extends Animal{
   public void Bark(){
    System.out.println("barking");
    }
}
class cat extends dog{
   public void fight(){
    System.out.println("fighting");
    }
}
public class Test{
 public static void main(String[] args){
     cat D=new cat();
     D.eat();
     D.Bark();
     D.fight();
    }
}