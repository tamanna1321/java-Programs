class Shape
{
    public void display(){
        System.out.println("this is shape");
    }
}
class Rectangle extends Shape
{
    public void display(){
        System.out.println("this is rectangular shape");
}

}
class Circle extends Shape
{
    public void display(){
        System.out.println("this is circular shape");
    }
}
class Square extends Rectangle
{
    public void display(){
        super.display();
        System.out.println("Square is Rectangle");
    }
}
public class ImplementShape{

    public static void main (String args[])
    {
        Square square=new Square();
        square.display();
        }

}