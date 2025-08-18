package Review.BinarySearch;

import BFS.Node;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    boolean same = true;
    public static void main(String[] args) {

    }
    public int search(int[] array, int target){
        int left = 0;
        int right = array.length -1;

        while(left <= right){
            int middle = (right + left) / 2;
            int middleVal = array[middle];

            if(target > middleVal){
                left = middle +1;
            } else if (target < middleVal) {
                right = middle -1;
            } else {
                return middle;
            }
        }
        return -1;
    }
    public void traverse(Node p, Node q) {
        if(p == null || q == null) return;


        if(p == null && q != null) same = false;
        if(q == null && p != null) same = false;

    }
}
