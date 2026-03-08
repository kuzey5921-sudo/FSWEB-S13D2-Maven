package org.example;

public class MainTest {

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

    public static String numberToWords(int number) {

        if (number < 0) {
            return "Invalid Value";
        }

        StringBuilder result = new StringBuilder();
        String numStr = String.valueOf(number);

        for (int i = 0; i < numStr.length(); i++) {

            char digit = numStr.charAt(i);

            switch (digit) {

                case '0':
                    result.append("Zero ");
                    break;

                case '1':
                    result.append("One ");
                    break;

                case '2':
                    result.append("Two ");
                    break;

                case '3':
                    result.append("Three ");
                    break;

                case '4':
                    result.append("Four ");
                    break;

                case '5':
                    result.append("Five ");
                    break;

                case '6':
                    result.append("Six ");
                    break;

                case '7':
                    result.append("Seven ");
                    break;

                case '8':
                    result.append("Eight ");
                    break;

                case '9':
                    result.append("Nine ");
                    break;
            }
        }

        return result.toString().trim();
    }
}