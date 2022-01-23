import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int arrLength = A.length;
        int validIndex = 0;

        //skip negative values
        for(int i =0; i < arrLength;i++){
            if(A[i]>0){
                validIndex = i;
                break;
            }
        }

        for(int j = validIndex ; j< arrLength -2;j++){
            int firstTwoSum;
            try{
                firstTwoSum = Math.addExact(A[j],A[j+1]);
            }catch(ArithmeticException e){
                //there is an overflow, so return 1;
                return 1;
            }

            if(firstTwoSum > A[j+2]){
                return 1;
            }
        }
        return 0;
    }
}