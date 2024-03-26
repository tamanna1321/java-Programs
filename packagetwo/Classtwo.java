package packagetwo;
import packageone.Classone;
public class classtwo
{
    public static void main(String args[])
    {
    Classone obj=new Classone();
    System.out.println("public variables from class one:"+obj.publicVariable);
   // System.out.println("protected variables from classone:"+obj.protectedVariable);
    //System.out.println("private variables from class one:"+obj.getprivateVariable());
    obj.setprivateVariable(50);
    //System.out.println("updated private variable from classone:"+obj.privateVariable());
    }   
} 