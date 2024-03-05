class Animal{
    void sound()
    {
     System.out.println("sound");
    }
}
class Dog extends Animal{
    void sound (String abc, int y){
     System.out.println("bark");
}
}
public class overridetest{
    public static void main(String[]args){
     Dog D=new Dog();
     D.sound();
    }
}
