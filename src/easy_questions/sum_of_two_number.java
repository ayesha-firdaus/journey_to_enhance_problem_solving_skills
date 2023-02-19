package easy_questions;

import java.util.Arrays;
import java.util.Scanner;

public class sum_of_two_number {
   static void func(String n) {

       int f = 1;
       String a="";
   String b="";
       for (int i = 0; i < n.length(); i++) {
           int d = n.charAt(i) - '0';

           if (d % 2 == 0) {

               a+=d/2;
               b+=d/2;
           } else {
               d = d / 2;
               if (f == 1) {

                   a+=d;
                   b+=d+1;
                   f = 0;
               } else {

                   a+=d+1;
                   b+=d;
                   f = 1;
               }
           }
       }

       System.out.println(Integer.parseInt(a)+"\t"+Integer.parseInt(b));

   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String n= sc.next();
            func(n);
        }
    }
}
