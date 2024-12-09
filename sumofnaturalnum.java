import java.util.*;
public class sumofnaturalnum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ns[]=new int[n];
        int sum=0;
        int k=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
            ns[k]=sum;
            k++;
        }
        System.out.println(Arrays.toString(ns));
    }
}