import java.util.Arrays;
import java.util.PriorityQueue;
public class main {
public int minMeetingRooms(int[][] intervals) {  // Your code here 
    if (intervals == null || intervals.length == 0) {
        return 0;
    }
    
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

    PriorityQueue<Integer> endTimes = new PriorityQueue<>();
    endTimes.offer(intervals[0][1]);
    
    // Iterate through the rest of the meetings
    for (int i = 1; i < intervals.length; i++) {
        int[] currentJob = intervals[i];
        int earliestEndTime = endTimes.peek();
        if (earliestEndTime <= currentJob[0]) {
            endTimes.poll();
        }
        

        endTimes.offer(currentJob[1]);
    }
    
    return endTimes.size();



}
}
