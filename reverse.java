import java.util.Scanner;
class reverse
{
public static void main(String a[])
{
    Scanner sc=new Scanner(System.in);
    int n,reverse=0;
    System.out.println("enter number to find reverse=");
    n=sc.nextInt();
    while (n>0)
    {
    reverse=(reverse*10)+n%10;
    n=n/10;}
    System.out.println("reverse="+reverse);
    }
}
