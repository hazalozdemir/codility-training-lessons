import java.util.*;
/* Test score %75 */
class Solution {
    public int solution(int N, int M) {
        // write your code in Java SE 8

        int greatestCommonDivisor = findGreatestCommonDivisor(N,M);
        int numOfChocalate = 0;

        while(greatestCommonDivisor*numOfChocalate < N){
            numOfChocalate+=1;
        }

        return numOfChocalate;
    }

    public int findGreatestCommonDivisor(int N,int M){
        if(M == 0){
            return N;
        }
        return findGreatestCommonDivisor(M, N % M);
    }
}