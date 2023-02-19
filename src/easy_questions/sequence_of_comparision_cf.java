package easy_questions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class sequence_of_comparision_cf {
    static  char comparision(String s)
    {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        if ( set.contains('=')&& set.contains('<')&&set.contains('>'))
        {
            return '?';
        }

        else if((set.contains('<')&& set.contains('='))||set.contains('<'))
        {
            return '<';
        }
        else if((set.contains('>')&& set.contains('='))||set.contains('>'))
        {
            return '>';
        }
        else{
            return '=';


        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            System.out.println(comparision(s));
        }
    }
}
