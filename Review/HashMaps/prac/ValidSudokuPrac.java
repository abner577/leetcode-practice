package Review.HashMaps.prac;

import java.util.HashSet;

public class ValidSudokuPrac {
    public static void main(String[] args) {

    }
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        int m = board.length; // # of rows
        int n = board[0].length; // # of columns

        // checks every row
        for(int i =0; i < m; i++){
            for(int j =0; j < n; j++){
                if(board[i][j] != '.') {
                    if(set.contains(board[i][j])) return false;
                    set.add(board[i][j]);
                }
            }
            set.clear();
        }

        // checks every column
        for(int i =0; i < n; i++) {
            for(int j =0; j < m; j++){
                if(board[j][i] != '.'){
                    if(set.contains(board[j][i])) return false;
                    set.add(board[j][i]);
                }
            }
            set.clear();
        }

        // checking every 3x3 box
        for(int a =0; a < 9; a +=3) {
            for(int b = 0; b < 9; b += 3){

                for(int i = a; i < a +3; i++){
                    for(int j = b; j < b +3; j++){
                        if(board[i][j] != '.'){
                            if(set.contains(board[i][j])) return false;
                            set.add(board[i][j]);
                        }
                    }
                }
                set.clear();
            }
        }
        return true;
    }
}
