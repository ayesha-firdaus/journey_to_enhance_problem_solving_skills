package A;

import java.util.Scanner;

public class Gardener_and_the_Capybaras_easyversion {
    static void solve(String s)
    {
        String a="",b="",c="";
        a=s.substring(0,1);
        b=s.substring(1,s.length()-1);
        c=s.substring(s.length()-1);
        System.out.println(a+"\t"+b+"\t"+c);
    }


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int t=sc.nextInt();
            while(t-->0)
            {

                String n=sc.next();

                solve(n);
            }
        }
    }

