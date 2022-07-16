/**
 * @author Susie-Wen
 * @version 1.0
 * @description:javase期末卷子编程第二题
 * @date 2022/7/15 21:16
 */
public class Test01 {
    public void merge(int A[],int m,int B[],int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while (i >= 0 && j >= 0) {
            if(B[j]>=A[i]){
                A[k]=B[j];
                k--;j--;
            }else{
                A[k]=A[i];
                k--;i--;
            }
            while(j>=0){
                A[k]=B[j];
                k--;j--;
            }
        }
    }
}
