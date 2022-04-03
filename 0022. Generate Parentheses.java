/*
https://leetcode.com/problems/generate-parentheses/
*/
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        recursion(n, n, "", result);
        return result;
    }
    public static void recursion (int open, int close, String output, List<String> result) {
        if (open == 0 && close == 0)
            result.add(output);
        if (open != 0) {
            String upd_output = output + "(";
            recursion(open - 1, close, upd_output, result);
        }
        if (close > open) {
            String upd_output = output + ")";
            recursion(open, close - 1, upd_output, result);
        }
    }
}