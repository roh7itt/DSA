package MathsForDSA;

public class DigitCount {
    // Function to count the number
    // of digits in an integer 'n'.
    public static int countDigits(int n) {
        // Initialize a counter variable
        // 'cnt' to store the count of digits.
        int cnt = 0;
        // While loop iterates until 'n'
        // becomes 0 (no more digits left).
        while (n > 0) {
            // Increment the counter
            // for each digit encountered.
            cnt = cnt + 1;
            // Divide 'n' by 10 to
            // remove the last digit.
            n = n / 10;
        }
        // Return the
        // count of digits.
        return cnt;
    }

    public static void main(String[] args) {
        int N = 329823;
        System.out.println("N: " + N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}

//To count the number of digits in a number,
// we can use the algorithm created in Extract Digits
// as now instead of extracting digits we are simply
// creating a counter to count the number of digits in the number.
//
//Algorithm:
//
//Initialise a counter to store the number of digits.
//While N is greater than 0, execute the following:
//Increment the counter by 1
//Update N by removing its last digit by performing a modulo 10 (%10) operation on it.
//After exiting the while loop, we return the counter as the number of digits.
