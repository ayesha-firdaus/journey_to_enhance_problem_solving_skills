package A;

import java.util.Scanner;



    public class A_TwoTowers {
        static String common(int m,int n,String a,String b)
        {
            String s="";
          for(int i=n-1;i>=0;i--)
          {
             s+=b.charAt(i);
          }
          a=a+s;
          int c=0;
          for(int i=0;i<a.length()-1;i++)
          {
              if(a.charAt(i)==a.charAt(i+1))
              {
                  c++;
                  if(c>1)
                  {
                      return "NO";
                  }
              }
          }
          return "YES";



        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int t=sc.nextInt();
            while(t-->0)
            {
                int m=sc.nextInt();
                int n=sc.nextInt();
                String a=sc.next();
                String b=sc.next();
                System.out.println(common(m,n,a,b));
            }
        }
    }
