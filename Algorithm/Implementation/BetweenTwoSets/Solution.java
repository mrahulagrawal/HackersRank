/**

Consider two sets of positive integers,  and . We say that a positive integer, , is between sets  and  if the following conditions are satisfied:

All elements in  are factors of .
 is a factor of all elements in .
In other words, some  is between  and  if that value of  satisfies  for every  in  and also satisfies  for every  in . For example, if  and , then our possible  values are and .

Given  and , find and print the number of integers (i.e., possible 's) that are between the two sets.

Input Format

The first line contains two space-separated integers describing the respective values of  (the number of elements in set ) and  (the number of elements in set ). 
The second line contains  distinct space-separated integers describing . 
The third line contains  distinct space-separated integers describing .

Constraints

Output Format

Print the number of integers that are considered to be between  and .

Sample Input

2 3
2 4
16 32 96
Sample Output

3
Explanation

There are three  values between  and :

:
All the elements in  evenly divide .
 evenly divides all the elements in .
:
All the elements in  evenly divide .
 evenly divides all the elements in .
:
All the elements in  evenly divide .
 evenly divides all the elements in .
Thus, we print  as our answer.
*/
package Algorithm.Implementation.BetweenTwoSets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static boolean isFactorial(int[] a, int n, boolean isFirst){
        boolean isFactor=true;
		for(int x:a){
				if(isFirst){
					if(n%x > 0){
						isFactor=false;
						break;
					}
                }
				else{
					if(x%n > 0){
						isFactor=false;
						break;
				}
            }
		}
        return isFactor;
    }
    static int getTotalX(int[] a, int[] b){
        int counter=0;
        if(a.length>1) Arrays.sort(a);
        if(b.length>1) Arrays.sort(b);
        
        int increment = a[a.length-1];
        int x=a[a.length-1];        

        while(x<=b[0]){
            if(isFactorial(a,x,true)) counter += isFactorial(b,x,false)? 1 : 0;
                x+=increment;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
