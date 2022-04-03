/*
https://leetcode.com/problems/reverse-integer/
*/
public class Solution
{
    public static int reverse(int x)
    {
        int sign;
        if(x != 0)
        sign = x/Math.abs(x);
        else
        return 0;
        x = x*sign;
        int flag = 0;
        int arr[] = {2,1,4,7,4,8,3,6,4,6};
        int rev = 0;
        if(x < 2147483647 && x >= -2147483647)
        {
            if(x > 1000000000)
            {
                for(int i = 0;x != 0 && flag >= 0;x = x/10,i++)
                {
                    rev = rev*10 + x%10;
                    if(x%10 < arr[i])
                    flag = flag+100;
                    else if(x%10 > arr[i])
                    flag--;
                }
                if(flag >= 0)
                return rev*sign;
                else
                return 0;
            }
            else
            {
                for(;x != 0;x = x/10)
                rev = rev*10 + x%10;
                return rev*sign;
            }
        }
        else
        return 0;
    }
}