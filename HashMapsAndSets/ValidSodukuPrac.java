package HashMapsAndSets;

import java.util.HashSet;

public class ValidSodukuPrac {
    public static void main(String[] args) {

    }
    public static boolean validS(char[][] board){
        HashSet<Character> hashSet = new HashSet<>();
        int counter = 0;

        while(counter < 9){
            for(int i =0; i < board.length; i++){
                if(board[counter][i] != '.') {
                    if(hashSet.contains(board[counter][i])) return false;
                    else hashSet.add(board[counter][i]);
                }
            }
            hashSet.clear();
            counter++;
        }
        counter = 0;

        while(counter < 9){
            for(int i =0; i < board.length; i++){
                if(board[i][counter] != '.') {
                    if(hashSet.contains(board[i][counter])) return false;
                    else hashSet.add(board[i][counter]);
                }
            }
            hashSet.clear();
            counter++;
        }
            for(int startRow = 0; startRow < 9; startRow += 3) {
                for(int startCol = 0; startCol < 9; startCol +=3){

                    for(int i =0; i < startRow + 3; i++){
                        for(int j =0; j < startCol + 3; j++){
                            if(board[i][j] != '.') {
                                if(hashSet.contains(board[i][j])) return false;
                                else hashSet.add(board[i][j]);
                            }
                        }
                    }
                    hashSet.clear();
                }
            }
        return true;
    }
}
