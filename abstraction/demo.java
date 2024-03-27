package abstraction;
interface   Shape{
    void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("draw a circle");
    }
}


class Square implements Shape{
    public void draw(){
        System.out.println("draw a square");
    }
}
public class demo{
    public static void main(String[]args){
        Circle aa =new Circle();
        Square bb = new Square();
        aa.draw();
        bb.draw();


    }
}