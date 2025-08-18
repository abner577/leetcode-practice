package HashMapsAndSets;

import java.util.HashSet;

public class ValidSudokuPrac {
    public static void main(String[] args) {

    }
    public static boolean validS(char[][] board){
        HashSet<Character> hashSet = new HashSet<>();
        int counter = 0;

        while(counter < 9){ //goes through all rows
            for(int i =0; i < board.length; i++){
                if(board[counter][i] != '.'){
                    if(hashSet.contains(board[counter][i])) return false;
                    else hashSet.add(board[counter][i]);
                }
            }
            counter++;
            hashSet.clear();
        }
        counter = 0;

        while(counter < 9){ //goes through all columns
            for(int i =0; i < board.length; i++){
                if(board[i][counter] != '.'){
                    if(hashSet.contains(board[i][counter])) return false;
                    else hashSet.add(board[i][counter]);
                }
            }
            counter++;
            hashSet.clear();
        }

        for (int startRow = 0; startRow < 9; startRow += 3) {                  //0 , 0  0 < 3
            for (int startCol = 0; startCol < 9; startCol += 3) {

                for (int row = startRow; row < startRow + 3; row++) {
                    for (int col = startCol; col < startCol + 3; col++) {
                        char val = board[row][col];
                        if (val != '.') {
                            if (hashSet.contains(val)) return false;
                            hashSet.add(val);
                        }
                    }
                }
                hashSet.clear();
            }
        }
        return true;
    }
}
