public class SalesAnalyzer {
    public static void main(String[] args) {
        int[] sales = {150, 200, 300, 250, 400, 350, 450};
        int maxSales = sales[0];
        int dayWithMaxSales = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                dayWithMaxSales = i;
            }
        }

        System.out.println("Day with highest sales: " + (dayWithMaxSales + 1));
        System.out.println("Highest sales amount: " + maxSales);
    }
}