import java.util.*;
class L
{
public static void main(String[] args)
{
int k,r,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
int n=sc.nextInt();
k=n;
while(n>0||n<0)
{
r=n%10;
s=s+r*r*ir;
n=n/10;
}
System.out.println("reverse is"+s);
if(k==s)
{
System.out.println("armstrong");
}
else
{
System.out.println("not armstrong");
}
}
}