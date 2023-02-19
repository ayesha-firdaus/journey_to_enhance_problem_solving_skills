package A;

import java.util.Scanner;

public class A_Walking_Boy {
    static String solve(int a[],int n)
    {
        int c=0;
        if(a[0]>=120)
        {
            if(a[0]>=240)
            {
                return "YES";
            }
            else{
                c++;
            }
        }
        else if(1440-a[n-1]>=120)
        {
            if(1440-a[n-1]>=240)
            {
                return "YES";
            }
            else{
                c++;
            }
            if(c>=2)
            {
                return "YES";
            }
        }
        else{
            for(int i=0;i<n-1;i++)
            {
                if(a[i+1]-a[i]>=120)
                {
                    if(a[i+1]-a[i]>=240)
                    {
                        return "YES";
                    }
                    else {
                        c++;
                    }
                    if(c>=2)
                    {
                        return "YES";
                    }
                }
            }
        }

        return "NO";
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

            System.out.println(solve(a,n));

        }
    }
}
