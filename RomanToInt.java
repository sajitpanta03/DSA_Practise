import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        RomanToInt solution = new RomanToInt();
        System.out.println(solution.romanToInt("IV"));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> romanNumeralMap = new HashMap<>();
        romanNumeralMap.put('I', 1);
        romanNumeralMap.put('V', 5);
        romanNumeralMap.put('X', 10);
        romanNumeralMap.put('L', 50);
        romanNumeralMap.put('C', 100);
        romanNumeralMap.put('D', 500);
        romanNumeralMap.put('M', 1000);

        int rs = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (romanNumeralMap.get(s.charAt(i)) < romanNumeralMap.get(s.charAt(i + 1))) {
                rs -= romanNumeralMap.get(s.charAt(i));
            } else {
                rs += romanNumeralMap.get(s.charAt(i));
            }
        }
        rs += romanNumeralMap.get(s.charAt(s.length() - 1));
        return rs;
    }
}
