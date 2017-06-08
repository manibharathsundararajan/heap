import java.util.*;
public class Natural {

    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int sum=0,i;
    for(i=1;i<=n;i++)
    {
        sum=sum+i;
    }
        System.out.println(sum);
    }
}
