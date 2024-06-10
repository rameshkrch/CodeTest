public class Shipping {
    public static long minimalNumberOfPackages(long items, long availableLargePackages, long availableSmallPackages) {
        long largeCapacity = 5;
        long maxLargeItems = largeCapacity * availableLargePackages;

        if (items <= maxLargeItems) {
            return (items + largeCapacity -1) / largeCapacity;
        }

        long remainingItems = items - maxLargeItems;
        if (remainingItems <= availableSmallPackages) {
            return availableLargePackages + remainingItems;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(13, 3, 10));
    }
}