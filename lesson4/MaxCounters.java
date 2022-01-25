import java.util.*;
/*Test score %77*/

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8

        int[] counterArr = new int[N];
        int maxValue = 0;
        for(int i = 0;i<A.length;i++){
            int value = A[i];

            if(1<= value && value<=N){
                //increase operation
                counterArr[value-1]+=1;
                if(maxValue< counterArr[value-1]){
                    maxValue = counterArr[value-1];
                }
            }else if(value == N+1){
                Arrays.fill(counterArr,maxValue);
            }
        }
        return counterArr;
    }
}