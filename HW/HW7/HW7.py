import heapq

class Main:
    def minMeetingRooms(self, intervals):
        if not intervals:
            return 0
        
        intervals.sort(key=lambda x: x[0])
        end_times = []
        heapq.heappush(end_times, intervals[0][1])
        
        for i in range(1, len(intervals)):
            start, end = intervals[i]
            earliest_end_time = end_times[0]
            
            if earliest_end_time <= start:
                heapq.heappop(end_times)
            heapq.heappush(end_times, end)
        
        return len(end_times)

# Test the solution
if __name__ == "__main__":
    main = Main()
    intervals = [[0, 30], [5, 10], [15, 20]]
    print(Main.minMeetingRooms(intervals)) 
