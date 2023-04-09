import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Methods {

    public static int countOccurance(List<String> list, String target) {
        if (list.size() < 1) {
            throw new ListSizeException("The [list] should not be so small, it should contain at least ten elements");
        }

        if (target.length() < 1) {
            throw new NullPointerException("Parameter [target] must not be null");
        }

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (target.equals(list.get(i))) {
                count++;
            }
        }
        return count;
    }

    public static List toList(int[] target) {
        if (target.length < 1) {
            throw new NullPointerException("Parameter [target] must not be null");
        }

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < target.length; i++) {
            numbers.add(target[i]);
        }
        return numbers;
    }

    public static List findUnique(List<Integer> target) {
        if (target.size() < 1) {
            throw new ListSizeException("The [target] parameter should not be null size");
        }

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < target.size(); i++) {
            if (!numbers.contains(target.get(i))) {
                numbers.add(target.get(i));
            }
        }
        return numbers;
    }

    public static void calcOccurance(List<String> target) {
        if (target.size() < 1) {
            throw new ListSizeException("The [target] parameter should not be null size");
        }

        List<String> temp = new ArrayList<>();

        for (int i = 0; i < target.size(); i++) {
            int count = Collections.frequency(target, target.get(i));
            if (!temp.contains(target.get(i))) {
                temp.add(target.get(i));
                System.out.println(target.get(i) + " трапляється - " + count + " рази/разів");
            }
        }
    }

    public static String findOccurance(List<String> target) {
        if (target.size() < 1) {
            throw new ListSizeException("The [target] parameter should not be null size");
        }

        List<String> temp = new ArrayList<>();
        List<Word> words = new ArrayList<>();

        for (int i = 0; i < target.size(); i++) {
            int count = Collections.frequency(target, target.get(i));
            if (!temp.contains(target.get(i))) {
                temp.add(target.get(i));
                words.add(new Word(target.get(i), count));
            }
        }
        return words.toString();
    }
}