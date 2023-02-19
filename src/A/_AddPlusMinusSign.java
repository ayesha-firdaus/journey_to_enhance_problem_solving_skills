package A;

import java.util.Scanner;

public class _AddPlusMinusSign {
    static String sign(int n,String s)
    {String ans="";
        for(int i=0;i<n-1;i++)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch1=='1'&&ch2=='0'||ch1=='0'&&ch2=='1'||ch1=='0'&&ch2=='0')
            {
                ans+='+';

            }
         else{
             ans+='-';
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n= sc.nextInt();
            String s=sc.next();


            System.out.println(sign(n,s));
        }
    }
}
