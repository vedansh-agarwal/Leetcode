/*
https://leetcode.com/problems/insert-interval/
*/

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int count = n+1;
        int x = newInterval[0];
        int y = newInterval[1];
        for(int i = 0; i < n; i++) {
            if(intervals[i][1] < x  || intervals[i][0] > y)
                continue;
            x = Math.min(x, intervals[i][0]);
            y = Math.max(y, intervals[i][1]);
            intervals[i][0] = -1;
            intervals[i][1] = -1;
            count--;
        }
        int output[][] = new int[count][2];
        int i = 0;
        while(i < n && intervals[i][1] != -1 && intervals[i][1] < x) {
            output[i][0] = intervals[i][0];
            output[i][1] = intervals[i][1];
            i++;
        }
        output[i][0] = x;
        output[i][1] = y;
        int counter = i;
        while(counter < n && intervals[counter][0] == -1)
            counter++;
        i++;
        while(counter < n) {
            output[i][0] = intervals[counter][0];
            output[i][1] = intervals[counter][1];
            counter++;
            i++;
        }
        return output;
    }
}
