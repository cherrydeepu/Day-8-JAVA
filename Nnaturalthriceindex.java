/*
20
1 10 28 55 91 136 190
*/
import java.util.*;
public class Nnaturalthriceindex{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ns[]=new int[n];
        int k=0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
            ns[k]=sum;
            k++;
        }
        for(int i=0;i<n;i+=3){
            System.out.print(ns[i]+" ");
        }
    }
}