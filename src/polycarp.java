import java.util.Scanner;

public class polycarp {
   static int cnt(String n)
    {
        int c=0;
        String s="314159265358979323846264338327";
        for(int i=0;i<n.length();i++)
        {
            if(s.charAt(i)==n.charAt(i))
            {
               c++;
            }
            else{
                break;
            }
        }
        return c;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String n= sc.next();

            System.out.println(cnt(n));

        }
    }
}
