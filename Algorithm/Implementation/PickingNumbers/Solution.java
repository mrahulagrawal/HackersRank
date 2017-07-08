import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] s=new int[100];
        for(int i = 0;i<n;i++){
            s[a[i]]++;
        }
        int max=0;
        for(int i = 0;i<n-1;i++){
            if(s[i]+s[i+1]> max) max = s[i]+s[i+1];
        }
        System.out.println(max);
    }
}
