import java.util.*;

public class Solution {

    public static int getMinimumBeverages(int[] height, int k) {
        // Sort array so highest height is last element
        Arrays.sort(height);
        // Find the difference between the maximal element and the jump height
        int difference = height[height.length - 1] - k;
        
        // If k is high enough to jump all hurdles, return 0
        // otherwise, return the difference between the height he can jump and the height he needs to jump
        return (difference > 0) ? difference : 0;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        in.close();
        
        System.out.println(getMinimumBeverages(height, k));
    }
}
