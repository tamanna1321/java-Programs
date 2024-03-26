public class Rectangle
{
    private double length;
    private double breadth;
    public Rectangle()
    {
        this.length = 0;
        this.breadth = 0;
    }
    public Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public Rectangle(double side)
    {
        this.length=side;
        this.breadth=side;
    }
    public double calculateArea()
    {
        return length*breadth;
    }
    public static void main(String args[])
    {
        Rectangle rectangle1=new Rectangle();
        Rectangle rectangle2=new Rectangle(5.0);
        Rectangle rectangle3=new Rectangle(13.0,21.0);
        System.out.println("Area of rectangle with no parameter:"+rectangle1.calculateArea());
        System.out.println("Area of rectangle with one parameter:"+rectangle2.calculateArea());
        System.out.println("Area of rectangle with two parameter:"+rectangle3.calculateArea());
}
}
