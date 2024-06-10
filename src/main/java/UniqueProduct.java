import java.util.*;

public class UniqueProduct {
    public static String firstUniqueProduct(String[] products) {
        Map<String, Integer> productCount = new HashMap<>();

        for (String product : products) {
            if (productCount.containsKey(product)) {
                productCount.put(product, productCount.get(product) + 1);
            } else {
                productCount.put(product, 1);
            }
        }

        for (String product : products) {
            if (productCount.get(product) == 1) {
                return product;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[]{"Apple", "Computer", "Apple", "Bag"}));
    }
}
