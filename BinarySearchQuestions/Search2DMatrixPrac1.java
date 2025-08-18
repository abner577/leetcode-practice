package BinarySearchQuestions;

public class Search2DMatrixPrac1 {
    public static void main(String[] args) {

    }
    public static boolean twoDMtarix(int[][] matrix, int target){
        int m = matrix.length; //rows
        int n = matrix[0].length; //columns
        int t = m * n;
        int left = 0;
        int right = t -1;

        while(left <= right){
            int middle = (left + right) /2;
            int i = middle / n;
            int j = middle % n;

            int middleVal = matrix[i][j];
            if(target > middleVal){
                left = middle +1;
            } else if (target < middleVal) {
                right = middle -1;
            } else {
                return true;
            }
        }
        return false;
    }
}
