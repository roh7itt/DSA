package MathsForDSA;

import java.util.*;

public class DivisorsOfNumber {
    // Function to find all divisors
    public List<Integer> getDivisors(int N) {
        // Create list to store divisors
        List<Integer> res = new ArrayList<>();

        // Loop from 1 to N
        for (int i = 1; i <= N; i++) {
            // Check if i is a divisor of N
            if (N % i == 0) {
                // Add i to the result
                res.add(i);
            }
        }
        // Return the list of divisors
        return res;
    }
}

class Divisors {
    public static void main(String[] args) {
        // Create object of Solution class
        DivisorsOfNumber sol = new DivisorsOfNumber();

        // Input number
        int N = 36;

        // Call the function to get divisors
        List<Integer> result = sol.getDivisors(N);

        // Print the result
        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}


//The brute force approach to find all the divisors of a number
// is to iterate through every number from 1 to N and check
// whether it is a divisor or not.
// We can store all the divisors and return the
// list of divisors after iteration.


//OPTIMAL APPROACH

//class ODivisor {
//    // Function to get all divisors
//    public List<Integer> getDivisors(int N) {
//        // Create a list to store divisors
//        List<Integer> res = new ArrayList<>();
//
//        // Loop from 1 to square root of N
//        for (int i = 1; i * i <= N; i++) {
//            // Check if i divides N
//            if (N % i == 0) {
//                // Add i to result
//                res.add(i);
//
//                // If N / i is different from i, add N / i too
//                if (i != N / i) {
//                    res.add(N / i);
//                }
//            }
//        }
//
//        // Return the list of divisors
//        return res;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Create object of Solution class
//        Solution sol = new Solution();
//
//        // Input number
//        int N = 36;
//
//        // Get divisors
//        List<Integer> result = sol.getDivisors(N);
//
//        // Print the result
//        System.out.print("Divisors of " + N + ": ");
//        for (int val : result) {
//            System.out.print(val + " ");
//        }
//        System.out.println();
//    }
//}
