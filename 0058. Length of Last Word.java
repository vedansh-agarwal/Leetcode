/*
https://leetcode.com/problems/length-of-last-word/
*/
class Solution {
    public int lengthOfLastWord(String s) {
         int i,t=s.length();
           
        while(s.charAt(t-1)==' '){
            t-=1;
            if(t<=0)
                break;
        }
        if(t<=0)
            return 0;
        for(i=t-1;i>-1;i--){
            if(s.charAt(i)!=' ')
                continue;
            else 
                break;
        }
        return t-i-1;
    }
}