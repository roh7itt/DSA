package MathsForDSA;

public class ReverseDigits {
    // Function to reverse digits of a number
    public int reverseNumber(int n) {
        // Variable to store reversed number
        int revNum = 0;

        // Loop until all digits are processed
        while (n > 0) {
            // Get the last digit
            int lastDigit = n % 10;

            // Append it to the reversed number
            revNum = revNum * 10 + lastDigit;

            // Remove the last digit from n
            n = n / 10;
        }

        // Return the reversed number
        return revNum;
    }
}

// Driver code
class Main {
    public static void main(String[] args) {
        ReverseDigits obj = new ReverseDigits();
        int num = 12345;
        System.out.println(obj.reverseNumber(num));  // Output: 54321
    }
}



//Algorithm
//We know that extracting digits of a number can be done by
// repeatedly taking modulo 10 and dividing by 10. Now,
// instead of just extracting digits, if we build a new number by
// appending these digits in reverse order, we effectively reverse the number.
// Each new digit becomes the least significant digit of the
// reversed number by multiplying the current reversed value by 10 before adding the digit.
//
//1. Initialize a variable to store the reversed number as 0.
//2. Loop while the original number is greater than 0.
//3. Extract the last digit by performing modulo 10.
//4. Multiply the reversed number by 10 and add the extracted digit.
//5. Remove the last digit from the original number using integer division by 10.
//6. Continue this process until the original number becomes 0.
//7. Return the reversed number.
