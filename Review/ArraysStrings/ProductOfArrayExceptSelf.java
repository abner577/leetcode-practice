package Review.ArraysStrings;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] array){
        int[] result = new int[array.length];


// Step 1: Fill result array with left products
        int leftMultiplier = 1;
        for (int i = 0; i < array.length; i++) {
            result[i] = leftMultiplier;
            leftMultiplier *= array[i];
        }


// Step 2: Multiply result array with right products
        int rightMultiplier = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            result[i] *= rightMultiplier;
            rightMultiplier *= array[i];
        }
        return result;

    }
}
