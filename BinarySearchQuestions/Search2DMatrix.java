package BinarySearchQuestions;

public class Search2DMatrix {
    public static void main(String[] args) {

    }
    public static boolean twoDMatrix(int[][] matrix, int target){
        int m = matrix.length; //number of rows
        int n = matrix[0].length;//length of a row (columns)
        int t = m * n; //total # of elements in matrix
        int left = 0;
        int right = t-1;

        while(left <= right){
            int middle = (left + right) / 2;
            int i = middle / n; //row index
            int j = middle % n; //column index

            int midVal = matrix[i][j];

            if(target > midVal){
                left = middle +1;
            } else if (target < midVal) {
                right = middle -1;
            } else {
                return true;
            }
        }
        return false;
    }
}
