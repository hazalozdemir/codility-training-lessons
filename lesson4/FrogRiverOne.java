import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int[] leavesArr = new int[X];
        int jumpedLeaveCounter = 0;
        for(int i = 0;i< A.length;i++){

            int leaveValue = A[i];
            if(leavesArr[leaveValue-1] == 0){
                jumpedLeaveCounter+=1;
                leavesArr[leaveValue-1]+=1;
            }
            if(jumpedLeaveCounter == X){
                return i;
            }
        }
        return -1;

    }
}