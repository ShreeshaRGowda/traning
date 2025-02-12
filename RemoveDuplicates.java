public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        
        for (char c : input.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String inputString = "banana";
        String outputString = removeDuplicates(inputString);
        System.out.println(outputString);  // Output: "ban"
    }
}