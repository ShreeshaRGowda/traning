import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String paragraph = "the cat and the hat";
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = paragraph.split(" ");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCount);  // Output: {the=2, cat=1, and=1, hat=1}
    }
}