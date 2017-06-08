import java.util.*;
public class Nsum {

    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int sum=0,i;
    for(i=0;i<=n;i++)
    {
        sum=sum+i;
    }
        System.out.println(sum);
    }
}
