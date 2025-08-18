package LeetcodeArraysAndStrings;

public class ProductExceptSelf {
    public static void main(String[] args) {

    }
    public static int[] productOfArray(int[] array){
        int n = array.length;
        int[] result = new int[n];

        // Step 1: Fill result array with left products
        int leftMultiplier = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftMultiplier;
            leftMultiplier *= array[i];
        }

        // Step 2: Multiply result array with right products
        int rightMultiplier = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightMultiplier;
            rightMultiplier *= array[i];
        }
        return result;
    }

}
