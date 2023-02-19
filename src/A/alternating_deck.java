package A;

import java.util.Scanner;

public class alternating_deck {
    static void alter(int n) {
        int alice_white = 0;
        int bob_white = 0;
        int alice_black = 0;
        int bob_black = 0;
        int card = 1;
        int turn = 1;
        while (n > 0) {
            card = Math.min(n, card);
            if (turn == 1) {

                if (card % 2 == 1) {

                    alice_white += (card / 2) + 1;
                    alice_black += (card / 2);

                } else {
                    alice_white += card / 2;
                    alice_black += card / 2;
                }
                turn = 0;
            } else {
                if (card % 2 == 1) {

                    bob_white+= (card / 2) ;
                    bob_black += (card / 2)+1;

                } else {
                    bob_white += card / 2;
                    bob_black += card / 2;
                }
                turn = 1;
            }
            n=n-card;
            card+=4;
        }
        System.out.println(alice_white + "\t" + alice_black + "\t" + bob_white + "\t" + bob_black);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0)
        {

            int n=sc.nextInt();

            alter(n);
        }
    }
}


