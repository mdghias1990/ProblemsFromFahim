package modulas;

public class ModulasProblem {


    /**
     * Modulus problems. Remember to write JavaDocs.
     */


    public static void main(String[] args) {
        System.out.println(isOdd(6));                        // Question Number 1
        System.out.println(isEven(10));                       // Question Number 2
        System.out.println(checkOddEven(13));                 // Question Number 3
        printOdd();                                                  // Question Number 4
        printEven(80);                             // Question Number 5
        System.out.println(isDivisibleBy3(12));                // Question Number 6
        System.out.println(isDivisibleBy5(19));                // Question Number 7
        checkDivisibleBy3Or5(20);                              // Question Number 8
        System.out.println("**********************");
        checkDivisibleBy3Or5FromRange(50);               // Question Number 9

    }

    // 1. Write a method that checks if an integer is odd.
    public static boolean isOdd(int num) {
        if (num % 2 == 1) {
            return true;
        }
        return false;
    }

    // 2. Write a method that checks if an integer is even.
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    // 3. Write a method that checks if an integer is odd or even.
    public static String checkOddEven(int num) {
        if (num % 2 == 0) {
            return num + " is an Even Number";
        }

        return num + " is an odd number.";
    }

    // 4. Write a method that prints all of the odd integers from range 1-100.
    public static void printOdd() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 5. Write a method that prints all of the even integers from range 1-X, where X is the upper bound.
    public static void printEven(int upperBoundNumber) {
        for (int i = 1; i <= upperBoundNumber; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 6. Write a method that checks if an integer is divisible by 3.
    public static boolean isDivisibleBy3(int num) {
        if (num % 3 == 0) {
            return true;
        }
        return false;
    }

    // 7. Write a method that checks if an integer is divisible by 5.
    // 6. Write a method that checks if an integer is divisible by 3.
    public static boolean isDivisibleBy5(int num) {
        if (num % 5 == 0) {
            return true;
        }
        return false;
    }


    // 8. Write a method that prints out foo if an integer is divisible by 3, prints out bar if an integer
    // is divisible by 5, and prints out foobar if an integer is divisible by both 3 and 5.
    public static void checkDivisibleBy3Or5(int num) {
        if ((num % 3 == 0) && (num % 5 == 0)) {
            System.out.println("foobar");
        } else if (num % 3 == 0) {
            System.out.println("foo");
        } else if (num % 5 == 0) {
            System.out.println("bar");
        }
    }

    // 9. Similar to #8, but do it from range 1-X, where X is the upper bound.
    public static void checkDivisibleBy3Or5FromRange(int upperBound) {
        for (int num = 1; num <= upperBound; num++) {


            if ((num % 3 == 0) && (num % 5 == 0)) {
                System.out.println(num + " is a foobar");
            } else if (num % 3 == 0) {
                System.out.println(num + " is a foo");
            } else if (num % 5 == 0) {
                System.out.println(num + " is a bar");
            }
        }
    }

}
