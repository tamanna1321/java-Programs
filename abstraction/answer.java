package abstraction;
abstract class Animal{
    //abstract method
    public abstract void sound();
}

class Elephant extends Animal{
    public void sound(){
        System.out.println("Triumph");
    }
}
public class answer{
    public static void main(String args[]){
        Elephant aa=new Elephant();
        aa.sound();
    }
}
