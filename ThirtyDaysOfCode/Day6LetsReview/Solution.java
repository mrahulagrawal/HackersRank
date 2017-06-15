package ThirtyDaysOfCode.Day6LetsReview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s=new String[n];
        
        for(int i=0;i<n;i++){
        	s[i]=in.next();
        }
        
        for(int i=0;i<n;i++){
            String result="";
            for(int j=0;j<2;j++){
                for(int k=0;k<s[i].length();k++){
                    if(j==0){
                        if(k%2==0){
                            result+=s[i].charAt(k);
                        }
                    }
                    else{
                        if(k%2!=0){
                            result+=s[i].charAt(k);
                        }
                    }
                }
                result+=" ";
            }
            System.out.println(result);
        }
        
    }
}