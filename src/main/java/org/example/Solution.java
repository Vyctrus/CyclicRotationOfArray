package org.example;

public class Solution {
    public int[] solution(int[] A,int K){
        int [] resultArray= new int[A.length];

        for(int i=0;i<A.length;i++){
            resultArray[(i+K)%A.length]=A[i];
        }

        return resultArray;
    }
}
