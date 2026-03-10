public class MainTest {

    // ==================== PALİNDROM ====================
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        String original = String.valueOf(number);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    // ==================== MÜKEMMEL SAYI ====================
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) return false;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    // ==================== SAYIYI KELİMEYE DÖK ====================
    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";
        String[] words = {"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"};
        String digits = String.valueOf(number);
        StringBuilder result = new StringBuilder();
        for (char c : digits.toCharArray()) {
            result.append(words[c - '0']).append(" ");
        }
        return result.toString().trim();
    }

    // ==================== ÖNCEKİ METODLAR ====================
    public static boolean shouldWakeUp(boolean barking, int hour) {
        if (hour < 0 || hour > 23) return false;
        if (!barking) return false;
        return hour < 8 || hour >= 20;
    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    private static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        int maxTemp = isSummer ? 45 : 35;
        return temperature >= 25 && temperature <= maxTemp;
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) return -1;
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) return -1;
        return radius * radius * Math.PI;
    }

    // ==================== MAIN ====================
    public static void main(String[] args) {
        // isPalindrome testleri
        System.out.println(isPalindrome(-1221));  // true
        System.out.println(isPalindrome(707));    // true
        System.out.println(isPalindrome(11212));  // false

        // isPerfectNumber testleri
        System.out.println(isPerfectNumber(6));   // true
        System.out.println(isPerfectNumber(28));  // true
        System.out.println(isPerfectNumber(5));   // false
        System.out.println(isPerfectNumber(-1));  // false

        // numberToWords testleri
        System.out.println(numberToWords(123));   // One Two Three
        System.out.println(numberToWords(1010));  // One Zero One Zero
        System.out.println(numberToWords(-12));   // Invalid Value

        // shouldWakeUp testleri
        System.out.println(shouldWakeUp(true, 1));    // true
        System.out.println(shouldWakeUp(false, 2));   // false
        System.out.println(shouldWakeUp(true, 8));    // false
        System.out.println(shouldWakeUp(true, -1));   // false

        // hasTeen testleri
        System.out.println(hasTeen(9, 99, 19));       // true
        System.out.println(hasTeen(23, 15, 42));      // true
        System.out.println(hasTeen(22, 23, 34));      // false

        // isCatPlaying testleri
        System.out.println(isCatPlaying(true, 10));   // false
        System.out.println(isCatPlaying(false, 36));  // false
        System.out.println(isCatPlaying(false, 35));  // true

        // area testleri
        System.out.println(area(5.0, 4.0));           // 20.0
        System.out.println(area(-1.0, 4.0));          // -1.0
        System.out.println(area(5.0));                // 78.53981...
        System.out.println(area(-1.0));               // -1.0
    }
}