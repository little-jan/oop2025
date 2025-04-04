package lab5;

public class WordTools {
    public static boolean isWord(String string) {
        boolean checker = true;
        for (int i = 0 ; i < string.length() ; i++) {
            char character = string.charAt(i);
            if (!('A' <= character && character <= 'Z' || 'a' <= character && character <= 'z')) {
                checker = false;
            }
        }
        return checker;
    }

    public static boolean isLowerCaseWord(String string) {
        if (isWord(string) == false) return false;
        else {
            String newString = string.toLowerCase();
            if (newString == string) return true;
            return false;
        }
    }

    public static boolean isUpperCaseWord(String string) {
        if (isWord(string) == false) return false;
        else {
            String newString = string.toUpperCase();
            if (newString == string) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isWord("Hello")); // true
        System.out.println(isWord("Hello!")); // false
        System.out.println(isWord("H ello")); // false
        System.out.println(isLowerCaseWord("hello")); // true
        System.out.println(isLowerCaseWord("hI")); // false
        System.out.println(isUpperCaseWord("TEST")); // true
        System.out.println(isUpperCaseWord("TEST ")); // false
        System.out.println(isUpperCaseWord("tEST")); // false
    }
}
