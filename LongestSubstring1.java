import java.util.HashSet;
import java.util.Set;

public class LongestSubstring1 {
public int lengthOfLongestSubstring(String s) {
int n = s.length(), max = 0, l = 0, r = 0;
Set<Character> set = new HashSet<>();
while (r < n) if (set.add(s.charAt(r))) max = Math.max(max, r++ - l + 1); else
set.remove(s.charAt(l++));
return max;
}

public static void main(String[] args) {
LongestSubstring ls = new LongestSubstring();

String s = "abcabcbb";
int result = ls.lengthOfLongestSubstring(s);
System.out.println("The length of the longest substring without repeating characters is: " + result);
}
}