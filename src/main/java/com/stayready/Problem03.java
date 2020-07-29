package com.stayready;

import java.util.Arrays;

public class Problem03 {
    public String checkValidity(Integer [] integerarray){
        Integer [] sortedintegerarray = Arrays.copyOf(integerarray, integerarray.length);
        Arrays.sort(sortedintegerarray);
        int count =0;
        for(int i=0; i<sortedintegerarray.length-1; i++){
            if(Math.abs(sortedintegerarray[i] - integerarray[i]) > 2){
                return "Too Chaotic";
            }
            else{
                if(Math.abs(sortedintegerarray[i] - integerarray[i]) == 2){
                    count+=2;
                }
                else if(Math.abs(sortedintegerarray[i] - integerarray[i]) == 1){
                    count++;
                }
            }
        }
        if(count % 2 != 0) {
            int result = (int)Math.round(count/2.0);
            return String.valueOf(result);
        }
        return String.valueOf(count);
}}
