package medium_questions;

import java.util.Scanner;

public class PrependAndAppend {
    static int check(int n,String s)
    {
        int i=0,j=n-1;
        while(i<=j)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1==ch2)
            {
                return s.substring(i,j+1).length();
            }
            i++;j--;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {

            int n=sc.nextInt();

            String s=sc.next();

            System.out.println(check(n,s));
        }
    }
}
