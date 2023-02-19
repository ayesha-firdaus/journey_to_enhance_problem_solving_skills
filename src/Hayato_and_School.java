import java.util.Arrays;
import java.util.Scanner;

public class Hayato_and_School {
    static void assign(int a[],int n) {
        int ans[] = new int[3];
        Arrays.fill(ans, -1);
        boolean c = false;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 1&&k!=3) {
                ans[k] = i + 1;
                k++;
            }

        }
        if (ans[2] != -1) {
            System.out.println("YES");
            System.out.println(ans[0] + "\t" + ans[1] + "\t" + ans[2]);
        } else if (ans[0] == -1) {
            System.out.println("NO");
        } else {
            k = 1;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0 && k != 3) {
                    ans[k++] = i + 1;
                }

            }
            if (ans[2] != -1) {
                System.out.println("YES");
                System.out.println(ans[0] + "\t" + ans[1] + "\t" + ans[2]);
            } else {
                System.out.println("NO");
            }


        }
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


          assign(a,n);
        }

    }
}
