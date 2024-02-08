public class FirstBadVersion {
    public static int firstBadVersion(int n) {
        int left = 1
        right = n;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    public static boolean isBadVersion(int version) {
        // implemented function
    }

    public static void main(String[] args) {
        int n = 10; 
        System.out.println(firstBadVersion(n));
    }
}
