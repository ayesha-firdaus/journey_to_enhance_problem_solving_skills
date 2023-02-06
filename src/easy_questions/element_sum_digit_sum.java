package easy_questions;

public class element_sum_digit_sum {
  static   int func(int  []nums)
    {
        int sum=0,digitsum=0;
        for(int i=0;i< nums.length;i++)
        {
            sum+=nums[i];
            String num=String.valueOf(nums[i]);
            if(num.length()>1)
            {
                digitsum+=digit_sum(nums[i]);

            }
            else{
                digitsum+=nums[i];
            }

        }
        return Math.abs(sum-digitsum);
    }
   static int digit_sum(int n)
    {
        int sum=0;
        while(n>0)
        {
           int d=n%10;
           sum+=d;
           n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[]={1,15,6,3};
        System.out.println(func(nums));
    }
}
