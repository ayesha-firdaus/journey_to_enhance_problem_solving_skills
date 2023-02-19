
import java.util.Scanner;


public class HallOfFame {
  static  int fame(int n,String s) {
      int l = 0, r = 0;
      boolean flag = false;
      int pos = -1;
      for (int i = 0; i < n; i++) {
          if (i + 1 < n && s.charAt(i) == 'L' && s.charAt(i + 1) == 'R') {
              l++;
              r++;
             pos = i + 1;
          } else if (s.charAt(i) == 'L') {
              l++;
              if (r >= 1) {
                  flag = true;
              }


          } else {
              r++;
          }

      }
      if (flag) {
          return 0;
      }
      else {
          if (l == 0 || r == 0) {
              return -1;
          } else {
              return pos;
          }


      }
  }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n= sc.nextInt();
            String s=sc.next();


            System.out.println(fame(n,s));
        }
    }
}
