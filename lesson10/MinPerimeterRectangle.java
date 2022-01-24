import java.util.*;

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int i = 1;
        int divisionCount = 0;
        int maxDivisionNum = 0;
        while(i*i < N){
            if(N%i == 0){
                divisionCount+=2;
                maxDivisionNum=i;
            }
            i+=1;
        }
        if(i*i == N){
            divisionCount+=1;
            maxDivisionNum=i;
        }
        return (2*maxDivisionNum) + (2*(N/maxDivisionNum));
    }
}