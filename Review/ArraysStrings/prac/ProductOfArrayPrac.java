package Review.ArraysStrings.prac;

public class ProductOfArrayPrac {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] array){
        int[] answer = new int[array.length];

        int leftMultiplier = 1;
        for(int i =0; i < array.length; i++){
            answer[i] = leftMultiplier;
            leftMultiplier *= array[i];
        }

        int rightMultplier= 1;
        for(int i =0; i < array.length; i++){
            answer[i] = rightMultplier;
            rightMultplier *= array[i];
        }
        return answer;
    }
}
