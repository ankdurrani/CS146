import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Main main = new Main(); 
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(main.minMeetingRooms(intervals));
    }

    public int minMeetingRooms(int[][] intervals) {  
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> endTimes = new PriorityQueue<>();
        endTimes.offer(intervals[0][1]);

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
