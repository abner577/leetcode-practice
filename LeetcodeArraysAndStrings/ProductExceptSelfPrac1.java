package LeetcodeArraysAndStrings;

public class ProductExceptSelfPrac1 {
    public static void main(String[] args) {

    }
    public static int[] product(int[] array){
        int[] result = new int[array.length];

        int leftMultiplier = 1;
        for(int i =0; i < array.length; i++){
            result[i] = leftMultiplier;
            leftMultiplier *= array[i];
        }

        int rightMultiplier = 1;
        for(int j = array.length -1; j >= 0; j--){
            result[j] *= rightMultiplier;
            rightMultiplier *= array[j];
        }
        return result;
    }
}
