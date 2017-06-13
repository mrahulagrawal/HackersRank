package CrackingTheCodingInterview.HashTablesRansomNote;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
	public static String checkRansom(Map<String, Integer> m, Map<String, Integer> r){
		for(Map.Entry<String, Integer> entry: r.entrySet()){
			String word=entry.getKey();
			if(!m.containsKey(word) || m.get(word)<entry.getValue()) return "No";
		}
		return "Yes";
	}
	public static Map<String, Integer> getCount(String[] s, int n){
		Map<String, Integer> counts=new HashMap<String, Integer>();
        for(int i=0;i<n;i++){
        	if(counts.containsKey(s[i])){
        		counts.put(s[i], counts.get(s[i])+1);
        	}
        	else{
        		counts.put(s[i], 1);
        	}
        }
        return counts;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        Map<String, Integer> mh=getCount(magazine, m);
        Map<String, Integer> rh=getCount(ransom,n);
        System.out.println(checkRansom(mh, rh));
    }
}
