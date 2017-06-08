import java.util.*;
public class Leap {

    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     if(n%4==0 || n%400==0)
     {
         System.out.println("this is leap year");
     }
     else
     {
      System.out.println("not a leap year");   
     }
     
     
         
     
    }
    
}
