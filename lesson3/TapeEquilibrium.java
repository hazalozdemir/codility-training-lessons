import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int length = A.length;
        if(length == 1){
            return A[0];
        }

        int totalSum = 0 ;

        for(int i =0; i< length;i++){
            totalSum+=A[i];
        }

        int leftSum = A[0];
        int minSum = Integer.MAX_VALUE;

        for(int i =1;i < length;i++){
            int rigthSum = totalSum - leftSum;
            int diff = Math.abs(leftSum-rigthSum);

            if(diff< minSum){
                minSum = diff;
            }
            leftSum = leftSum + A[i];
        }

        return minSum;
    }
}