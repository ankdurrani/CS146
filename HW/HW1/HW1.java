public class Palindrome {
    public static boolean isPalindrome(String s) {
        String convertS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return convertS.equals(new StringBuilder(convertS).reverse().toString());
    }

    public static void main(String[] args) {
        String s = "racecar o racecar";
        System.out.println(isPalindrome(s)); 
    }
}
