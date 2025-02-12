public class Postfix {
    public static int[] computePostfixSum(int[] fuel) {
        int[] postfixSum = new int[fuel.length];
        postfixSum[fuel.length - 1] = fuel[fuel.length - 1];
        for (int i = fuel.length - 2; i >= 0; i--) {
            postfixSum[i] = fuel[i] + postfixSum[i + 1];
        }
        return postfixSum;
    }

    public static void main(String[] args) {
        int[] fuel = {5, 10, 3, 7, 8};  // Example input
        int[] postfixSum = computePostfixSum(fuel);
        System.out.print("PostfixSum[] = ");
        for (int sum : postfixSum) {
            System.out.print(sum + " ");
        }
    }
}

