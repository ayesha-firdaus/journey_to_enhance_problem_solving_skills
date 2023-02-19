package medium_questions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Codeforces_Round_849_D_distinct_split {
   static int MaxSplit(int n,String s)
    {
        Set<Character> set=new HashSet<>();
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        for(int i=0;i<n;i++)
        {
            set.add(s.charAt(i));
            prefix[i]=set.size();

        }
        set.clear();
        for(int i=n-1;i>=0;i--)
        {
            set.add(s.charAt(i));
            suffix[i]=set.size();

        }
        int max=0;
        for(int i=0;i<n-1;i++)
        {
            int ans=prefix[i]+suffix[i+1];
             max=Math.max(ans,max);


        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n= sc.nextInt();
            String s=sc.next();


            System.out.println(MaxSplit(n,s));
        }
    }
}
