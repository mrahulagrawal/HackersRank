package CrackingTheCodingInterview.StringsMakingAnagrams;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution1 {
	
	public static final int NUMBER_CHARACTERS=26;
	
	public static int[] getCharCount(String s){
		int[] c=new int[NUMBER_CHARACTERS];
		int x=(int)'a';
		for(int i=0;i<s.length();i++){
			int y=(int)s.charAt(i) - x;
			c[y]++;
		}
		return c;
	}
	
	public static int getDifference(int[] f, int[] s){
		if(f.length != s.length){
			return 0;
		}
		int count=0;
		for(int i=0;i<f.length;i++){
			count+=Math.abs(f[i]-s[i]);
		}
		return count;
	}
    
	public static int numberNeeded(String first, String second) {
        int[] f=getCharCount(first);
        int[] s=getCharCount(second);
        return getDifference(f,s);
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    	
    }
}
