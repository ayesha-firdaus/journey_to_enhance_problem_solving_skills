package easy_questions;

import java.util.Scanner;

public class check_string {
   static String check(char c)
    {String a="codeforces";
        for(int i=0;i<a.length();i++)
        {
            char ch =a.charAt(i);
            if(ch==c)
            {
                return "YES";
            }
        }
        return "NO";

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            char ch=sc.next().charAt(0);
            String ans=check(ch);
            System.out.println(ans);
        }
    }
}
