import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        Map<Integer, Integer> sc=new HashMap<Integer, Integer>();
        int tempScore=0, rnk=0;
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
            if(scores[scores_i]!=tempScore){
                tempScore=scores[scores_i];
                rnk++;
                sc.put(tempScore,rnk);
            }
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        int index=scores.length-1;
        for(int i=0;i<alice.length;i++){
            rnk=0;
            for(int j=index;j>=0;j--){       
                if(alice[i]<scores[j]){
                    index=j;
                    rnk=sc.get(scores[j])+1;
                    System.out.println(rnk);
                    break;
                }
            }
            if(rnk==0) System.out.println("1");            
        }
    }
}
