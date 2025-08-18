package LeetcodeArraysAndStrings;

public class ProductExceptSelfPrac {
    public static void main(String[] args) {

    }
    public static int[] productExceptSelf(int[] array){
        int[] result = new int[array.length];

        int leftMultiplier = 1;
        for(int i =0; i < array.length; i++){
            result[i] = leftMultiplier;
            leftMultiplier *= array[i];
        }

        int rightMultiplier =1;
        for(int i =array.length -1; i >= 0; i--){
            result[i] *= rightMultiplier;
            rightMultiplier *= array[i];
        }
        return result;
    }
}
