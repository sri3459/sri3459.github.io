import java.util.*;
class G
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
s=s*10+r;
n=n/10;
}
System.out.println("reverse is"+s);
if(k==s)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}