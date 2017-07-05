package  Algorithm.Implementation.BreakingTheRecords;
import java.util.*;

class Solution {
    public class Record {
        private int score;
        public Record left;
        public Record right;
        
        /**
        *    A best or worst score record.
        *    @param The record's score.
        **/
        public Record(int score) {
            this.score = score;
            this.left = null;
            this.right = null;
        }
        
        /**
        *    Checks for and inserts new records.
        *    @param score The score for the (potential) new best or worst record.
        **/
        public void insert(int score) {
            if (score < this.score) {
                if (this.left == null) {
                    this.left = new Record(score);
                }
                else {
                    this.left.insert(score);
                }
                
            }
            else if (score > this.score) {
                if (this.right == null) {
                    this.right = new Record(score);
                }
                else {
                    this.right.insert(score);
                }
            }
        }
        
        /**
        *    @return The number of times the worst record was broken (edges in left branch of tree).
        **/
        public int depthLeft() {
            System.err.println("Worst Record: " + this.score);
            return (this.left == null) ? 0 : (1 + this.left.depthLeft());
        }
        
        /**
        *    @return The number of times the best record was broken (edges in right branch of tree).
        **/
        public int depthRight() {
            System.err.println("Best Record: " + this.score);
            return (this.right == null) ? 0 : (1 + this.right.depthRight());
        }
    }
    
    public String solve(int[] scores) {
        Record root = new Record(scores[0]);
        
        for (int i = 1; i < scores.length; i++) {
            root.insert(scores[i]);
        }
        
        // Return number of broken records in the correct order
        return root.depthRight() + " " + root.depthLeft();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        in.close();
        Solution s = new Solution();
        System.out.println(s.solve(score));
    }
}