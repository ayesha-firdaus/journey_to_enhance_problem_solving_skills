package easy_questions;

import java.util.Scanner;

public class hacker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if ((n1 - n2) >1) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}
