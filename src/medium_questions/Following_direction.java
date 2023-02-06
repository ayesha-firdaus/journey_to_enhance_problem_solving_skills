package medium_questions;

import java.util.Scanner;

public class Following_direction {
    static String check(int i,int j,String s,int n,int k)
    {

        if(i==1&&j==1)
        {
            return "Yes";
        }
        if(k==n)
            return "No";
        char ch=s.charAt(0);
        if(ch=='U')
        {
           return check(i+1,j,s.substring(1),n,k+1);
        }
        if(ch=='D')
        {
          return  check(i-1,j,s.substring(1),n,k+1);
        }
        if(ch=='R')
        {
           return check(i,j+1,s.substring(1),n,k+1);
        }
        if(ch=='L')
        {
          return  check(i,j-1,s.substring(1),n,k+1);
        }
        return "No";

    }
    static String Iterative(int i,int j,String s,int n,int k)
    {

        while(k<n)
        {
            if(i==1&&j==1)
            {
                return "YES";
            }
          char ch=s.charAt(k++);
          if(ch=='U')
          {
              i++;

          }
          if(ch=='D')
          {
              i--;
          }
            if(ch=='R')
            {
                j++;

            }
            if(ch=='L')
            {
                j--;
            }

        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {

            int n=sc.nextInt();

            String s=sc.next();
            String ans=Iterative(0,0,s,n,0);
            System.out.println(ans);
        }
    }

}
