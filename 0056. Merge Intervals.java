/*
https://leetcode.com/problems/merge-intervals/
*/

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i+1; j < n; j++) 
                if(intervals[min][0] > intervals[j][0])
                    min = j;
            swap(intervals, min, i);
        }
        int count = n;
        for(int i = 0; i < n-1; i++) {
            if(intervals[i][1] < intervals[i+1][0])
                continue;
            intervals[i+1][0] = Math.min(intervals[i+1][0], intervals[i][0]);
            intervals[i+1][1] = Math.max(intervals[i+1][1], intervals[i][1]);
            intervals[i][0] = -1;
            intervals[i][1] = -1;
            count--;
        }
        int output[][] = new int[count][2];
        for(int i = n-1; i >= 0; i--) {
            if(intervals[i][0] == -1)
                continue;
            output[--count][0] = intervals[i][0];
            output[count][1] = intervals[i][1];
        }
        return output;
    }
    
    public void swap(int intervals[][], int i, int j) {
        int temp = intervals[i][0];
        intervals[i][0] = intervals[j][0];
        intervals[j][0] = temp;
        temp = intervals[i][1];
        intervals[i][1] = intervals[j][1];
        intervals[j][1] = temp;
    }
}
