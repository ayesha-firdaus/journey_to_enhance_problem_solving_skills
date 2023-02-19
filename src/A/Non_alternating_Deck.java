package A;

import java.util.Scanner;

public class Non_alternating_Deck {
   static void alter(int n)
   {
      int card=1;
      int turn=1;
      int alice=0;
      int bob=0;
      while(n>0)
      {
         if(turn==1)
         {
            alice+=Math.min(card,n);
            turn=0;
         }
         else{
            bob+=Math.min(card,n);
            turn=1;
         }
         n=n-card;
         card+=4;
      }
      System.out.println(alice+"\t"+bob);
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
