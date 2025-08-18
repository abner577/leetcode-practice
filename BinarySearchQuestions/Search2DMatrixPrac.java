package BinarySearchQuestions;

public class Search2DMatrixPrac {
    public static void main(String[] args) {

    }
    public static boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length; //# of rows
        int n = matrix[0].length; //# of columns
        int t = m * n;
        int left = 0;
        int right = t -1;

        while (left <= right){
            int mid = (left + right) /2;
            int i = mid / n;
            int j = mid % n;

            int midVal = matrix[i][j];

            if(target > midVal){
                left = mid +1;
            } else if (target < midVal) {
                right = mid -1;
            } else{
                return true;
            }
        }
        return false;
    }
}
