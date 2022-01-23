import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        if(elementsBothPositiveAndNegative(A)){
            return decideMaxProduct(A);
        }else if(elementsPositive(A)){
            return calcProduct(A[A.length-1],A[A.length-2],A[A.length-3]);
        }else{
            //elements negative
            return calcProduct(A[0],A[1],A[2]);
        }

    }
    public int decideMaxProduct(int[] a){
        int product1 = calcProduct(a[0],a[1],a[2]);
        int product2 = calcProduct(a[a.length-1],a[a.length-2],a[a.length-3]);
        int product3 = calcProduct(a[0],a[1],a[a.length-1]);
        int initialMax= Math.max(product2,product3);
        return Math.max(product1,initialMax);
    }
    public boolean elementsBothPositiveAndNegative(int[] a){
        return a[0]*a[a.length-1] < 0;
    }

    public boolean elementsPositive(int[]a){
        return a[0] >=0;
    }

    public int calcProduct(int a,int b,int c){
        return a*b*c;
    }
}

