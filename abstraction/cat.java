package abstraction;
abstract class Animal{
 void sound(){
    
 }
}

interface pet{
    void run();
}

class Elephant extends Animal implements
pet{
    public void sound(){
        System.out.println("The elephant triumphs");
    }
    public void run(){
        System.out.println("elephant runs slowly");
    }
    }
public class cat{
    public static void main (String[]args){
        Elephant elephant=new Elephant();
        elephant.sound();
        elephant.run();

    }
}


