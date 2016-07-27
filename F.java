import java.util.*;
class F
{
public static void main(String[] args)
{
int nd=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
while(n>0||n<0)
{
nd++;
n=n/10;
}
System.out.println("no of digits is "+nd);
}
}