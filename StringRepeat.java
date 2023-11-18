import java.util.HashSet;
import java.util.Set;

public class StringRepeat {
    public static void main(String[] args) {
        String inputString = "your_input_string";
        int count = countUniqueAlphabets(inputString);
        System.out.println(count);
    }

    private static int countUniqueAlphabets(String input) {
        input = input.toLowerCase();
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }

        return uniqueChars.size();
    }
}
