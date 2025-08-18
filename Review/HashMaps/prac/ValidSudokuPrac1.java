package Review.HashMaps.prac;

import java.util.HashSet;

public class ValidSudokuPrac1 {
    public static void main(String[] args) {

    }
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        int m = board.length; // rows
        int n = board[0].length; // columns

        // goes through all rows, by going through each column per row
        for(int i =0; i < m; i++){
            for(int j =0; j < n; j++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j])) return false;
                    set.add(board[i][j]);
                }
            }
            set.clear();
        }

        // goes through each column, by going through each 'row' per column
        for(int i =0; i < n; i++){
            for(int j =0; j < m; j++){
                if(board[j][i] != '.'){
                    if(set.contains(board[j][i])) return false;
                    set.add(board[j][i]);
                }
            }
            set.clear();
        }

        // places use in the correct start position of each 3x3
        for(int a =0; a < 9; a+=3){
            for(int b = 0; b < 9; b+=3){


                for(int i =a; i < a + 3; i++){
                    for(int j = b; j < b + 3; j++){
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
