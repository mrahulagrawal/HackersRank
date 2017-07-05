package Algorithm.Implementation.BreakingTheRecords;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int best = 0;
        int worst = 0;
        int bestCounter = 0;
        int worstCounter = 0;
        best = score[0];
        worst = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] < worst) {
                worst = score[i];
                worstCounter++;
            }
            if (score[i] > best) {
                best = score[i];
                bestCounter++;
            }
        }
        System.out.println(bestCounter + " " + worstCounter);
    }
}