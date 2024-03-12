import java.util.Scanner;
class prime
{
    public static void main(String args[]){
        int n,i,count=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter number to check=");
n=sc.nextInt();
i=1;//initialization
while(n>=i){
    if(n%i==0)
    count=count+1;
    i=i+1;
}
if(count==2)
System.out.println("prime");
else
System.out.println("non prime");
}
    }
