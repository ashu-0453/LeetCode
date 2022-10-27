package com.astush;

import java.util.ArrayList;
import java.util.*;

public class AddToArrayFormInt {
    public static void main(String[] args) {
        int[] arr={9,9,9,9,9,9,9,9,9,9};
        int k=1;
        List<Integer> ans=addToArrayForm(arr,k);
        System.out.println(ans);

    }

    static List<Integer> addToArrayForm(int[] num, int k) {
            int n=num.length-1;
            List<Integer> result=new ArrayList<>(n);
            while(n>=0||k!=0){
                if(n>=0){
                    k=num[n]+k;
                    n--;
                }
                result.add(k%10);
                k/=10;
            }
            Collections.reverse(result);
            return result;
    }
}

