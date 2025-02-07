public class ProductRatingAnalyzer {
    public static void main(String[] args) {
        int[] ratings = {5, 3, 4, 5, 2, 5, 3, 4, 4, 2, 3};
        System.out.println("Most frequent rating: " + findMostFrequentRating(ratings));
    }

    public static int findMostFrequentRating(int[] ratings) {
        int maxCount = 0;
        int mostFrequentRating = ratings[0];

        for (int i = 0; i < ratings.length; i++) {
            int count = 0;
            for (int j = 0; j < ratings.length; j++) {
                if (ratings[i] == ratings[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequentRating = ratings[i];
            }
        }

        return mostFrequentRating;
    }
}