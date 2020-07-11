package modulas;

import java.util.ArrayList;
import java.util.List;

public class StringProblem {

    /**
     * String problems. Remember to write JavaDocs.
     */
    public static void main(String[] args) {
        System.out.println(checkStringEqual("Test", "TEST"));
        System.out.println(checkStringEqual2("Test", "TEST"));
        System.out.println(checkStringLength("ba"));
        System.out.println(checkStringLength("bangladesh"));
        System.out.println(getFirstNLastChar("Brown"));
        System.out.println(getFirstNLastChar("b"));


    }

    // 1. Write a method that checks if two strings are equal, case sensitive.
    // (ex: "test" & "test" -> true; "Test" & "TEST" -> false; "TeSt" & "tEsT -> false; "TeSt" & "TeSt" -> true)
    public static boolean checkStringEqual(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }


    // 2. Write a method that checks if two strings are equal, case insensitive.
    // (ex: "test", "test" -> true; "Test", "TEST" -> true; "TeSt" & "tEsT -> true; "TeSt" & "TeSt" -> true)
    public static boolean checkStringEqual2(String str1, String str2) {
        if ((str1.toLowerCase()).equals(str2.toLowerCase())) {
            return true;
        }
        return false;
    }

    // 3. Write a method that returns the first and last character of a given string, respectively.
    // (ex: "Brown" -> {'B', 'n'}; "monkey1" -> {'m', '1'})
    public static List<Character> getFirstNLastChar(String str) {
        List<Character> firstNLastChar = new ArrayList<>();
        if (str.length() == 0) {
            System.out.println("Given String is Empty");
            return firstNLastChar;
        } else if (str.length() == 1) {
            System.out.println("Given String has only one character");
            firstNLastChar.add(str.charAt(0));
            return firstNLastChar;
        } else {
            firstNLastChar.add(str.charAt(0));
            firstNLastChar.add(str.charAt(str.length() - 1));
            return firstNLastChar;
        }
    }

    // 4. Write a method that checks if the length of a string is greater than or equal to 3.
    // (ex: "Uh" -> false; "Auditorium" -> true; "Man" -> true);
    public static boolean checkStringLength(String str) {
        if (str.length() < 3) {
            return false;
        }
        return true;
    }

    // 5. Write a method that returns the number of words from a given string. Assume each word is separated by a space.
    // (ex: "This is a sample string" -> 5; "But why?" -> 2; "I cannot wait to go home and lay on my bed" -> 11)


    // 6. Write a method that returns the first three characters of a given string. Be wary about an edge case.

    // 7. Write a method that returns the last three characters of a given string. Be wary about an edge case.

    // 8. Write a method that concatenates the first and last three characters of a given string. Be wary about an edge case.

    // 9. Write a method that checks if the given string contains numerical values.

    // 10. Write a method that checks if the given string contains alphabetical characters.

    // 11. Write a method that will remove vowels from a given string.

    // 12. Write a method that returns the number of words from a given string.

    // 13. Write a method that returns the number of words from a file.

    // 14. Write a method that checks if a string is a palindrome.

    // 15. Write a method that checks if two strings are an anagram.

    // 16. Write a method that checks if a string contains duplicate characters.

}
