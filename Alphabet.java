import java.util.*;
public class Alphabet {

    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
    char c=a.charAt(0);
    int b=(int)c;
    if((b>=65 && b<=91)||(b>=97 && b<=122))
            {
                System.out.println("Alphabet");
            }
    else
        
    {
        System.out.println("charater");
    }
    }
}
