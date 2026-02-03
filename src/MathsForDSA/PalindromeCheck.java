package MathsForDSA;

public class PalindromeCheck {
    // Function to check if a given integer is a palindrome
    public boolean palindrome(int n) {
        int revNum = 0; // Initialize a variable to store the reverse of the number
        int dup = n; // Create a duplicate variable to store the original number

        // Iterate through each digit of the number until it becomes 0
        while (n > 0) {
            int ld = n % 10; // Extract the last digit of the number
            revNum = (revNum * 10) + ld; // Build the reverse number by appending the last digit
            n = n / 10; // Remove the last digit from the original number
        }

        // Check if the original number is equal to its reverse
        return dup == revNum; // Return true if they are equal, otherwise false
    }
}

class Palindrome {
    public static void main(String[] args) {
        int number = 4554; // Example number
        PalindromeCheck obj = new PalindromeCheck();
        if (obj.palindrome(number)) { // Check if the number is a palindrome
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
