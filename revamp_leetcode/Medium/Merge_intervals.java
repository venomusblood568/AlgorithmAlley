import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Check if input is null or has only one interval
        if (intervals == null || intervals.length <= 1)
            return intervals;

        // Sort the intervals based on their start values
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // Create a list to store the merged intervals
        List<int[]> merged = new ArrayList<>();
        
        // Initialize variables to track the start and end of the current interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Iterate through each interval in the sorted array
        for (int[] interval : intervals) {
            // If the current interval overlaps with the previous one
            if (interval[0] <= end) {
                // Update the end of the current interval if needed
                end = Math.max(end, interval[1]);
            } else {
                // If the current interval doesn't overlap, add the previous merged interval
                // and update the start and end to the current interval's start and end
                merged.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }
        }
        
        // Add the last merged interval to the list
        merged.add(new int[]{start, end});

        // Convert the list of merged intervals to an array and return
        return merged.toArray(new int[merged.size()][]);
    }
}
