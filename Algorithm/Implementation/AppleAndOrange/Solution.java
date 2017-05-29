package Algorithm.Implementation.AppleAndOrange;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int apple_count=0, orange_count=0;
        for(int i=0;i<m;i++){
            if((apple[i])+a>=s && (apple[i]+a)<=t) apple_count++;
        }
        for(int i=0;i<n;i++){
            if((orange[i])+b>=s && (orange[i]+b)<=t) orange_count++;
        }
        System.out.println(apple_count);
        System.out.println(orange_count);
    }
}