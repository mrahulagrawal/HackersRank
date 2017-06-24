package ThirtyDaysOfCode.Day10BinaryNumbers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
    public static String getBoolean(int n){
        int reminder=0;
        int quotient=n;
        String nBool="";
        while(quotient>0){
            reminder=quotient%2;
            quotient/=2;
            nBool+=reminder;
        }
        return nBool;
    }
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        int n=6;
    	String nBool=getBoolean(n);
    	System.out.println(nBool);
        int max=0, counter=0;
        for(int i=0;i<nBool.length();i++){
            if(nBool.charAt(i)=='0'){
                if(counter>max) max=counter; 
                counter=0;
            } 
            else counter++;
        }
        if(counter>max) max=counter;
        System.out.println(max);
    }
}
