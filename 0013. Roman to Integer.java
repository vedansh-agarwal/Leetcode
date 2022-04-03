/*
https://leetcode.com/problems/roman-to-integer/
*/
class Solution 
{
    static String ss;
    public static int romanToInt(String s) 
    {
        ss = s;
        int num = 0;
        String str = "MDCLXVI";
        int arr[] = {1000,500,100,50,10,5,1};
        for(int i = 0;i < s.length();i++)
        {
            if(check(i) == -1)
                num += arr[str.indexOf(s.charAt(i))];
            else
                num += check(i++);
        }
        return num;
    }
    public static int check(int x)
    {
        if(x == ss.length()-1)
            return -1;
        String c = ss.substring(x,x+2);
        String st = "CM CD XC XL IX IV";
        int arr[] = {900,0,0,400,0,0,90,0,0,40,0,0,9,0,0,4};
        if(st.indexOf(c) != -1)
            return arr[st.indexOf(c)];
        else
            return -1;
    }
}