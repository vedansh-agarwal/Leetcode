/*
https://leetcode.com/problems/longest-palindromic-substring/
*/
class Solution {
       public  String longestPalindrome(String s) {
        
        
        if(s.isEmpty() || s== null)
            return "";

        int lengthOfString = s.length();

        char[] stringChar = s.toCharArray();



        boolean[][] dp = new boolean [lengthOfString][lengthOfString] ;
        int maxStringLength =0;
        int maxStringStart= 0;
        for(int k =1 ; k<= lengthOfString; k ++){

            int i = 0;
            int j=i+k -1;
            for(; i< lengthOfString && j<lengthOfString; i++, j++){

                if(k==1)
                    dp[i][j] = true;
                else if(k==2){
                    if(stringChar[i] == stringChar[j])
                        dp[i][j]= true;
                    else
                        dp[i][j] = false;
                }else if(k>2){

                    if(stringChar[i] == stringChar[j] && dp[i+1][j-1]) {
                        dp[i][j] = true;
                        
                    }
                    else
                        dp[i][j] = false;

                }

                if(k > maxStringLength && dp[i][j]){
                    maxStringLength = k;
                    maxStringStart = i;
                }

            }

        }
        return s.substring(maxStringStart, maxStringStart  + maxStringLength );
    }
}