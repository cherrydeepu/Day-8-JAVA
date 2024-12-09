import java.util.*;
public class CountUDM {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
      //finding max
      Arrays.sort(arr);
      int max=arr[n-1];
      //Finding count array
      int c[]=new int[max+1];
      for(int i=0;i<n;i++)
      c[arr[i]]++;
      //1.Finding missing values
      System.out.println("Code for missing values");
      for(int i=0;i<max+1;i++)
      {
        if(c[i]==0)
        System.out.print(i+ " ");
      }
      //2.Unique values
      System.out.println();
      System.out.println("Unique values");
      for(int i=0;i<max+1;i++)
      {
        if(c[i]==1)
        System.out.print(i+ " ");
      }
      //3.Dupplicate  values
      System.out.println();
      System.out.println("Duplicate values");
      for(int i=0;i<max+1;i++)
      {
        if(c[i]>1)
        System.out.print(i+ " ");
      }
  }
}