import java.util.ArrayList;
import java.util.List;

public class HackerRankInAString {
    public static void main(String[] args) {
     System.out.println(hackerrankInString("hereiamstackerrank"));
     System.out.println(hackerrankInString("hackerworld"));
    }

    public static String hackerrankInString(String s) {
        List<String> stringList = new ArrayList<>();
        String hr = "hackerrank";
        for (int i = 0; i < s.length(); i++) {
            String mainStringIndex = String.valueOf(s.charAt(i));
            String matchStringIndex = String.valueOf(hr.charAt(stringList.size()));
            if (mainStringIndex.equals(matchStringIndex)) {
                stringList.add(mainStringIndex);
            }
            if (hr.length() == stringList.size()){
                return "YES";
            }
        }
        return "NO";
    }

}
