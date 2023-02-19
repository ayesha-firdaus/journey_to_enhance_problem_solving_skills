package A;

import java.util.Scanner;

public class EverybodyLikesGoodArrays {
   static int good(int a[],int n)
    {
        int c=0;
        for(int i=0;i<n-1;i++)
        {
           if(a[i]%2==1&&a[i+1]%2==1||a[i]%2==0&&a[i+1]%2==0)
           {
               c++;
           }

        }
      return c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n= sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }

            System.out.println(good(a,n));

        }
    }
}
