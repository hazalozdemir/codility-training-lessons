import java.util.*;
/* %92 */
class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int i = 1;
        int result = 0;

        while(i*i<N){
            if(N%i == 0){
                result+=2;
            }
            i+=1;
        }

        if(i*i == N)
            result+=1;
        return result;
    }
}