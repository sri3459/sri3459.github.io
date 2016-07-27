import java.util.*;
class T
{
public static void main(String[] args)
{
int s=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
s=s*i;
}
System.out.println("sum is "+s);
}
}