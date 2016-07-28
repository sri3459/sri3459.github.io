import java.util.Scanner;
 
class REV
{
   public static void main(String args[])
   {
      int n,r, s=0;
 
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      while( n>0||n<0 )
      {
          r = n % 10;
          s = s*10+r;
          n = n/10;
      }
 
      System.out.println("Reverse of entered number is "+s);
   }
}