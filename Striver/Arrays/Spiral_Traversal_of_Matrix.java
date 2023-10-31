import java.util.*;
public class Spiral_Traversal_of_Matrix {
    public static List<Integer> printspiral(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;

        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = m - 1;

        while (top <= bottom && left <= right) {

            // Traverse from left to right along the top row
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++; // Move the top boundary down

            // Traverse from top to bottom along the rightmost column
            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--; // Move the right boundary left

            // Traverse from right to left along the bottom row, if there is a bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(mat[bottom][i]);
                }
                bottom--; // Move the bottom boundary up
            }

            // Traverse from bottom to top along the leftmost column, if there is a left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++; // Move the left boundary right
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[][] mat = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                      {9, 10, 11, 12},
                        {13, 14, 15, 16}};

        List<Integer> ans = printspiral(mat);
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }

    }
}
