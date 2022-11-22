package com.astush;
import java.util.Arrays;


public class Unique_IntegersSum_Zero {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Arrays.toString(sumZero(n)));

    }
    static int[] sumZero(int n) {

        int[] arr=new int[n];

        if(n==1){
            arr[0]=0;
            return arr;
        }

        int a= 1;

        if(n%2==0){
        for(int i=0;i<n;i+=2) {
            arr[i]=a;
            arr[i+1]=a*(-1);
            a++;
            }
        }
        else{
            arr[0]=0;
            for (int i = 1; i < n; i+=2) {
                arr[i]=a;
                arr[i+1]=a*(-1);
                a++;
            }
        }
        return arr;
    }
}
