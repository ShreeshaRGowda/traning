import java.util.*;

public class GroupAnagrams {
public List<List<String>> groupAnagrams(String[] strs) {
Map<String, List<String>> map = new HashMap<>();
for (String s : strs) {
char[] ca = s.toCharArray();
Arrays.sort(ca);
map.computeIfAbsent(String.valueOf(ca), k -> new ArrayList<>()).add(s);
}
return new ArrayList<>(map.values());
}

public static void main(String[] args) {
GroupAnagrams ga = new GroupAnagrams();
String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
List<List<String>> result = ga.groupAnagrams(strs);
System.out.println(result);
}
}