package HashMapsAndSets;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {

    }
    public static boolean validSudoku(char[][] board){
        HashSet<Character> hashSet = new HashSet<>();
        int counter = 0;

        //we need an outer loop so that we can repeat this for every single row
        while (counter < 9) {
            for (int i = 0; i < 9; i++) { //going through rows
                if(board[counter][i] != '.'){
                    if (hashSet.contains(board[counter][i])) return false;
                    else hashSet.add(board[counter][i]);
                }
            }
            counter++;
            hashSet.clear();
        }
        int countC = 0;
            while(countC < 9) { //going through columns
                for(int i =0; i < 9; i++){
                    if(board[counter][i] != '.'){
                        if(hashSet.contains(board[i][countC])) return false;
                        else hashSet.add(board[i][countC]);
                    }
                }
                countC++;
                hashSet.clear();
            }

            int startRow = 0;
            while (startRow < 9) {
            int startCol = 0;
            while (startCol < 9) {
                HashSet<Character> boxSet = new HashSet<>();
                for (int row = startRow; row < startRow + 3; row++) {
                    for (int col = startCol; col < startCol + 3; col++) {
                        char val = board[row][col];
                        if (val != '.') {
                            if (boxSet.contains(val)) return false;
                            boxSet.add(val);
                        }
                    }
                }
                startCol += 3; // Move to next box in the row
            }
            startRow += 3; // Move to next row of boxes
        }
        return true;
    }
}
