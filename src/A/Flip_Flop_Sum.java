package A;

import java.util.Scanner;

public class Flip_Flop_Sum {
    static int flip(int a[],int n)
    {
        int x=-1,y=-1,c=0,sum=0;
        if(a[n-1]==1)
        {
            c++;
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==-1&&a[i+1]==-1)
            {
              x=i;
              y=i+1;

            }
            if(a[i]==1)
            {
                c++;
            }

        }
        if(x!=-1&&y!=-1)
        {
            a[x]=1;
            a[y]=1;
        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        if(c==n)
        {
            return sum-4;
        }
        return sum;

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

            System.out.println(flip(a,n));

        }

    }
}