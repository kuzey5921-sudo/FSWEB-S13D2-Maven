public class MainTest {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    // Palindrom kontrolü
    public static boolean isPalindrome(int number) {

        number = Math.abs(number);

        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        return original == reverse;
    }

    // Mükemmel sayı kontrolü
    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    // Sayıyı kelimelere çevirme
    public static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {
                "Zero","One","Two","Three","Four",
                "Five","Six","Seven","Eight","Nine"
        };

        String numStr = String.valueOf(number);
        String result = "";

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            result += words[digit] + " ";
        }

        return result.trim();
    }
}