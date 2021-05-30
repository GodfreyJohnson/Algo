package com.dp;

public class BitCount {
    public static void main(String[] args) {
        BitCount bitCount = new BitCount();
        int[] result = bitCount.count(16);
        for (int item: result){
            System.out.println(item);
        }
    }

    private int[] count(int num) {
        int[] result= new int[num+1];
        result[0]=0;
        for(int i=0;i<num/2;i++){
            result[2*i]=result[i];
            if(2*i + 1<num){
                result[2*i+1]=result[i]+1;
            }
        }
        return result;
    }
}
