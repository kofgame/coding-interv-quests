package arrays.and.strings;

/**
 * Created by Andrey on 6/16/2020.
 */
public class UniqueCharsDeterminer {


    public static void main(String[] args) {
        String testStr = "asdfghhgfdsazxcvbbvcxz";
        System.out.println(containsDuplicates(testStr));
        System.out.println(isUniqueChars2(testStr));
    }

    /**
     * Checks every char of @param string with every other char of the string for duplicate occurrences.
     */
    private static boolean containsDuplicates(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * Clever trick - check chars against ASCII table !
     * NOTE: This is a great idea to point out to an interviewer
     */
    public static boolean isUniqueChars2(String str) {
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charSet[val]) return false;
            charSet[val] = true;
        }
        return true;
    }

}
