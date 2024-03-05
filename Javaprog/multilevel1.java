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
class cat extends Dog{
   public void fight(){
    System.out.println("fighting");
    }
}
public class multilevel1{
 public static void main(String[] args){
     cat E=new cat();
     E.eat();
     E.Bark();
     E.fight();
    }
}