package katawars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeTheDeadFishSwim {

    public static void main(String[] args) {
        int[] responseOne = parse("iiisdoso");
        System.out.println("Result = " + Arrays.toString(responseOne));
        int[] responseTwo = parse("iiisdosodddddiso");
        System.out.println("Result = " + Arrays.toString(responseTwo));

    }

    public static int[] parse(String data) {
        int v = 0;
        List<Integer> response = new ArrayList<>();
        for (String s : data.split("")) {
            switch (s) {
                case "i":
                    v++;
                    break;
                case "d":
                    v--;
                    break;
                case "s":
                    v *= v;
                    break;
                case "o":
                    response.add(v);
                    break;
                default: throw new IllegalArgumentException("Not valid code letter");
            }
        }
        return response.stream().mapToInt(Integer::intValue).toArray();
    }
}
