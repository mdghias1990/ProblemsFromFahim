package modulas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NumberProblem {
    /**
     * Number problems. Remember to write JavaDocs.
     */
    public static void main(String[] args) {
        System.out.println(getOncePlace(-567));                 // Question # 1
        getTensPlace(5);                                        // Question # 2
        getHundredsPlace(38);                                   // Question # 3
        System.out.println(getAbsoluteValue(-224));                 // Question # 4
        System.out.println(getAbsoluteValue2(34));                  //Question # 4
        System.out.println(getFirstDigit(266355));         // Question # 5
        System.out.println(getFirstDigitOfInteger(-3445));       // Question # 6

        int[] numList = {3, 5, 6, 33, 66, 5, 1};
        // taking list type array is time wasting when practice.
        System.out.println(getAvarage(numList));                           // Question # 7
        System.out.println(getSmallestNumber(numList));                    // Question # 8
        System.out.println(getLargestNumber(numList));                     // Question # 9


        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(70);
        list.add(18);
        list.add(1);
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(getEvensFromList(list));                        // Question # 10
        System.out.println(getListRoundedFloorCeiling(9.7));         // Question # 11
        System.out.println(getListRoundedFloorCeiling(13.55));       //Question # 11
        System.out.println(getListRoundedFloorCeiling(5.4));         // Question # 11

    }

    // 1. Write a method that returns the ones' place of an integer. (ex: 3284 -> 4; 17 -> 7; 190 -> 0; 5 -> 5)

    public static int getOncePlace(int inputNum) {
        int num = Math.abs(inputNum);
        int numSize = num / 10;
        int oncePlace = num % 10;
        if (numSize == 0) {
            return num;
        }
        return oncePlace;
    }

    // 2. Write a method that returns the tens' place of an integer. (ex: 3284 -> 8; 17 -> 1; 190 -> 9; 5 -> error)
    public static void getTensPlace(int inputNum) {
        int num = Math.abs(inputNum);

        String str = String.valueOf(num);
        if (str.length() == 1) {
            System.out.println("error");
        } else {
            int newNum = num / 10;
            int tensPlace = newNum % 10;
            System.out.println(tensPlace);
        }

    }

    // 3. Write a method that returns the hundreds' place of an integer.
    public static void getHundredsPlace(int inputNum) {
        int num = Math.abs(inputNum);
        String str = String.valueOf(num);
        if (str.length() == 1 || str.length() == 2) {
            System.out.println("error");
        } else {
            int newNum = num / 100;
            int hundredsPlace = newNum % 10;
            System.out.println(hundredsPlace);
        }

    }

    // 4. Write a method that returns the absolute value of an integer. (ex: -192 -> 192; 121 -> 121; -8 -> 8)
    public static int getAbsoluteValue(int num) {
        int absoluteValue = Math.abs(num);

        return absoluteValue;
    }

    public static int getAbsoluteValue2(int num) {
        if (num < 0) {
            return num * (-1);
        }
        return num;
    }


    // 5. Write a method that returns the first digit of a non-negative number. Do not incorporate String. (ex: 432 -> 4)

    public static int getFirstDigit(int nonNegetiveNum) {
        List<Integer> listOfDigits = new ArrayList<Integer>();
        int num = nonNegetiveNum;

        while (num != 0) {
            int disits = num % 10;
            listOfDigits.add(disits);
            num = num / 10;

        }

        if (listOfDigits.isEmpty() == true) {
            System.out.println("input number is 0");
            return 0;
        }
        return listOfDigits.get(listOfDigits.size() - 1);
    }

    // 6. Write a method that returns the first digit of an integer. Do not incorporate String. (ex: 432 -> 4; -7819 -> 7)
    public static int getFirstDigitOfInteger(int inputNum) {
        List<Integer> listOfDigits = new ArrayList<Integer>();
        int num = Math.abs(inputNum);

        while (num != 0) {
            int disits = num % 10;
            listOfDigits.add(disits);
            num = num / 10;

        }

        if (listOfDigits.isEmpty() == true) {
            System.out.println("input number is 0");
            return 0;
        }
        return listOfDigits.get(listOfDigits.size() - 1);
    }

    // 7. Write a method that returns the average number from a list of integers.
    public static double getAvarage(int[] arr) {
        double total = 0;
        int elementCount = 0;
        for (int ele : arr) {
            total = total + ele;
            elementCount++;
        }
        double avgValue = total / elementCount;

        return avgValue;
    }

    // 8. Write a method that returns the smallest number from a list of integers.
    public static int getSmallestNumber(int[] arr) {
        int smallestNum = arr[0];
        for (int num : arr) {

            if (num < smallestNum) {
                smallestNum = num;
            }
        }
        return smallestNum;
    }

    // 9. Write a method that returns the largest number from a list of integers.
    public static int getLargestNumber(int[] arr) {
        int largestNum = arr[0];
        for (int num : arr) {

            if (num > largestNum) {
                largestNum = num;
            }
        }
        return largestNum;
    }

    // 10. Write a method that returns a list of even numbers from a given list of integers. (ex: {3, 2, 5, 8, 9} -> {2, 8})
    public static List getEvensFromList(List<Integer> list) {
        List<Integer> evenList = new ArrayList<Integer>();
        for (int num : list) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }

        return evenList;
    }


    // 11. Write a method that returns the rounded integer, floor and ceiling, respectively, from a double.
    // (ex: 9.7 -> {10, 9, 10}; 5.4 -> {5, 5, 6}; 13.55 -> {14, 13, 14})
    public static List<Integer> getListRoundedFloorCeiling(double num) {
        List<Integer> listOfRoundedFloorCeiling = new ArrayList<Integer>();

        int roundedInteger, floor, ceiling;
        double temp = num * 10;
        int newTemp = (int) temp;

        if (newTemp % 10 < 5) {
            roundedInteger = (int) num;

        } else {
            roundedInteger = (int) num + 1;
        }
        floor = (int) num;
        ceiling = (int) num + 1;

        listOfRoundedFloorCeiling.add(roundedInteger);
        listOfRoundedFloorCeiling.add(floor);
        listOfRoundedFloorCeiling.add(ceiling);

        return listOfRoundedFloorCeiling;
    }


}
