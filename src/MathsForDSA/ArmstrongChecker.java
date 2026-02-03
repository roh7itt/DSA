package MathsForDSA;

public class ArmstrongChecker {
    // Static method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int k = String.valueOf(num).length(); // Get number of digits
        int sum = 0;
        int n = num;

        while (n > 0) {
            int ld = n % 10;             // Last digit
            sum += Math.pow(ld, k);      // Add ld^k
            n /= 10;                     // Remove digit
        }

        return sum == num;
    }

    static void main(String[] args) {
        int number = 153;

        // Use class method to check
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}



//Algorithm
//
//Calculate the number of digits in the input number and store it in k.
//Initialise a variable sum to 0. This variable will store the sum of each digit raised to the power of number of digits in number.
//Make a copy of the original number to store it in a temporary variable.
//Run a while loop with the condition n>0 and at each iteration:
//////Get the last digit of n by using the modulus operator % with 10 and store it in a temporary variable ld.
//////Add the digit ld raised to the power of k of the sum.
//////Update n by integer division with 10 effectively removing the last digit.
//After the loop, check if the original input number is equal to the sum of the digits raised to the power of the number of digits in the number.
//////If they are equal, return true indicating the number is an Armstrong number.
//////If they are not equal, return false indicating that the number is not an Armstrong number.