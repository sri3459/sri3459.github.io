import java.util.*;
class XC
{
public static void main(String[] args)
{
int i=1,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
while(i<=n)
{
if(n%i==0)
{
c++;
}
i++;
}
if(c==2)
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}
}
}