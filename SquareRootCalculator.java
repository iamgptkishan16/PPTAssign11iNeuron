/*Question[1]-------Given a non-negative integer `x`, return *the square root of* `x` *rounded down to the nearest integer*. The returned integer should be **non-negative** as well.

You **must not use** any built-in exponent function or operator.

- For example, do not use `pow(x, 0.5)` in c++ or `x ** 0.5` in python.

**Example 1:**  
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.*/


public class SquareRootCalculator {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        long left = 1;
        long right = x;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) right;
    }

    public static void main(String[] args) {
        int x = 4;
        int result = mySqrt(x);
        System.out.println(result);
    }
}
