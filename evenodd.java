import java.util.Scanner;
class evenodd
{
    public static void main(String ar[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check=");
        n=sc.nextInt();
        if(n%2==0)
        System.out.println("number is even=");
        else
        System.out.println("number is odd=");

    }
}