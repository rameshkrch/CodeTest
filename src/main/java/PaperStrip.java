import java.util.*;

public class PaperStrip {
    public static int minPieces(int[] original, int[] desired) {
        Map<Integer, Integer> desiredIndexMap = new HashMap<>();
        for (int i = 0; i < desired.length; i++) {
            desiredIndexMap.put(desired[i], i);
        }

        int pieces = 0;
        int previousIndex = 0;

        for (int num : original) {
            if (desiredIndexMap.containsKey(num)) {
                int currentIndex = desiredIndexMap.get(num);
                if (currentIndex != previousIndex + 1) {
                    pieces++;
                }
                previousIndex = currentIndex;
            }
        }

        return pieces;
    }

    public static void main(String[] args) {
        int[] original = {1, 4, 3, 2};
        int[] desired = {1, 2, 4, 3};
        System.out.println(minPieces(original, desired));
    }
}
