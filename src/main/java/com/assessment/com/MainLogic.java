package com.assessment.com;

import java.util.Arrays;

public class MainLogic {
    public int FirstFactorial(int num) {
        int result =1;
        for ( int i = num ; i > 0 ; i--) {
            result *= i;
        }
        return result;
    }
    public String FirstReverse(String str){
        String result ="";
        char[] ch=str.toCharArray();
        for (int i = ch.length; i >0 ; i--){
            result += ch[i-1];
        }
        return result;
    }
    public String AlphabetSoup(String str){
        String result ="";
        char[] chList=str.toCharArray();
        Arrays.sort(chList);
        for (char ch : chList ) {
            result += ch;
        }
        return result;
    }
}
