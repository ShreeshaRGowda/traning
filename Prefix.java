public class Prefix {
    public static int[] computePrefixSum(int[] sales) {
        int[] prefixSum = new int[sales.length];
        prefixSum[0] = sales[0];
        for (int i = 1; i < sales.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + sales[i];
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        int[] sales = {10, 20, 15, 30, 25};  // Example input
        int[] prefixSum = computePrefixSum(sales);
        System.out.print("PrefixSum[] = ");
        for (int sum : prefixSum) {
            System.out.print(sum + " ");
        }
    }
}