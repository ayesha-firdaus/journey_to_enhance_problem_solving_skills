import java.util.Scanner;

public class product {
    static int pro(int n,int a[])
    {
        int p=1;
        for(int i=0;i<n;i++)
        {
            p=p*a[i];
        }
        int t=1;
        for(int i=0;i<n;i++)
        {
            t=t*a[i];
            if(t==(p/t))
                return i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n= sc.nextInt();
            int a[]=new int[n];
           for(int i=0;i<n;i++)
           {
               a[i]=sc.nextInt();
           }


            System.out.println(pro(n,a));
        }
    }
}
