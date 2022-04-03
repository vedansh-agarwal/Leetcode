/*
https://leetcode.com/problems/add-binary/
*/
class Solution {
    char carry;
    public String addBinary(String a, String b) {
        carry = '0';
        int aL = a.length();
        int bL = b.length();
        int L = Math.max(aL,bL);
        String output = "";
        for(int i = 0;i < L;i++)
        {
            if(i >= a.length())
                output = binary('0',b.charAt(bL-i-1)) + output;
            else if(i >= b.length())
                output = binary(a.charAt(aL-i-1),'0') + output;
            else
                output = binary(a.charAt(aL-i-1),b.charAt(bL-i-1)) + output;
            System.out.println(output);
        }
        if(carry == '1')
            output = "1" + output;
        return output;
    }
    public String binary(char a, char b)
    {
        if(carry == '1')
        {
            if(a == '1' && b == '1')
                return "1";
            else if((a == '1' && b == '0') || (a == '0' && b == '1'))
                return "0";
            else
            {
                carry = '0';
                return "1";
            }
        }
        else
        {
            if(a == '1' && b == '1')
            {
                carry = '1';
                return "0";
            }
            else if((a == '1' && b == '0') || (a == '0' && b == '1'))
                return "1";
            else
                return "0";
        }
    }
}
