package CrackingTheCodingInterview.StringsMakingAnagrams;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static long numberNeeded(String first, String second) {
        Map<Character, Long> f1=new HashMap<Character, Long>();
        Map<Character, Long> s1=new HashMap<Character, Long>();
        for(int i=0;i<first.length();i++){
        	char c=first.charAt(i);
        	if(f1.containsKey(c)) continue;
        	else{ 
        		long x=first.chars().filter(num -> num == c).count();
        		f1.put(c, x);
        	}
        }
        for(int i=0;i<second.length();i++){
        	char c=second.charAt(i);
        	if(s1.containsKey(c)) continue;
        	else{ 
        		long x=second.chars().filter(num -> num == c).count();
        		s1.put(c, x);
        	}
        }
        long count=0;
        for( char x : f1.keySet()){
        	if(s1.containsKey(x)){
        		count+=s1.get(x)==f1.get(x)?0:Math.abs(s1.get(x)-f1.get(x));
        	}
        	else{
        		count+=f1.get(x);
        	}
        }
        for( char x : s1.keySet()){
        	if(f1.containsKey(x)){
        		continue;
        	}
        	else{
        		count+=s1.get(x);
        	}
        }
        return count;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    	
    }
}
