import java.util.Scanner;

public class TasiaAndDice {
  static  int[] func(int n,int s,int r) {

    int a[]=new int[n];
    a[0]=s-r;
      int val = s-r;
      for (int j = 2; j <= n; j++) {

          while (r - val < n - j) {
              val--;
          }
         a[j-1]=val;
          r = r - val;
      }
      return a;
  }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n= sc.nextInt();
            int s= sc.nextInt();
            int r= sc.nextInt();
            int b[]=func(n,s,r);
            for(int i=0;i<n;i++)
            {
                System.out.print(b[i]+" ");
            }
            System.out.println();
        }
    }
}
