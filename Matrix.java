import java.util.*;
public class Matrix{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int a;
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }for(int i=0;i<r;i++)
    {
        int s=0;
      for(int j=0;j<c;j++)
      {
       if(arr[i][j]==1){
        a=i+j;
        s+=a;
       }
      }
      System.out.println(s);
    }
  }
}