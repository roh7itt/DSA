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


//Algorithm
//To check if a number is a palindrome, we can use the algorithm created in Extract Digits as now we extract the digits of the number to create a reversed number.
//We then compare the reversed number with the original number. If they are equal, the original number is a palindrome. If they are not equal the original number is not a palindrome.
//
//Algorithm
//
//Initialise an integer revNum to 0. This variable will store the reverse of the number.
//Make a duplicate of the original number and store it in an integer dup for later comparison.
//Run a while loop with the condition n>0 to reverse the number and at each iteration
//Get the last digit of n by using the modulus operator % with 10 and store it in a temporary variable ld.
//Update the revNum by multiplying it by 10 and adding the last digit ld.
//Update n by integer division with 10 effectively removing the last digit.
//After the loop, check if the original number dup is equal to the reversed number revNum.
//If they are equal, return true indicating the number is a palindrome.
//If they are not equal, return false indicating that the number is not a palindrome.
