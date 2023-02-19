package easy_questions.A;

import java.util.Scanner;

public class A_Exponential_Equation {
  static  void func(int n)
    {
        if(n%2==1)
        {
            System.out.println(-1);
        }
        else{
            System.out.println(1+"\t"+(n/2));
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n= sc.nextInt();
            func(n);
        }
    }
}
