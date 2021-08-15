package katawars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStrings {

    /* Complete the solution so that it splits the string into pairs of two characters. If the string contains an
     odd number of characters then it should replace the missing second character of the final pair
      with an underscore ('_').
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("")));
        System.out.println(Arrays.toString(solution("abcdef")));
        System.out.println(Arrays.toString(solution("HelloWorld")));
        System.out.println(Arrays.toString(solution("abcde")));
        System.out.println(Arrays.toString(solution("LovePizza")));

    }

    public static String[] solution(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() % 2 == 1) {
            s = s + "_";
        }
        for (int i = 0; i < s.length() - 1; i += 2) {
            result.add(s.substring(i, i + 2));
        }
        return result.toArray(new String[0]);
    }
}
