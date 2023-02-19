package easy_questions.A;

import java.util.Arrays;
import java.util.Scanner;

public class _GamingForces {
    static int count(int n,int a[])
    {
      int c=0;
        for(int i=0;i<n;i++)
        {
          if(a[i]==2)
          {
              c++;
          }
        }
    if(c==0)
    {
        return 1;
    }
    else if(c%2==1)
    {
        return -1;
    }
    else{
        int t=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==2)
            {
                t++;
            }
            if(t==(c/2))
            {
                return i+1;
            }

        }
    }

return 0;
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


            System.out.println(count(n,a));
        }
    }

}
