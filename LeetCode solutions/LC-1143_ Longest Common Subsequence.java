// Memoisation
/*
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][]dp = new int[text1.length()][text2.length()];
        for(int[]arr:dp) Arrays.fill(arr, -1);
        return solve(text1, text2, 0, 0, dp);
    }
    public int solve(String s1, String s2, int i, int j, int[][]dp) {
        if(i == s1.length() || j == s2.length()) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = 1 + solve(s1, s2, i+1, j+1, dp);
        } else {
            return dp[i][j] = Math.max(solve(s1, s2, i, j+1, dp), solve(s1, s2, i+1, j, dp));
        }
    }
}
*/

// Tabulation
/*
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][]dp = new int[text1.length()+1][text2.length()+1];
        for(int i=text1.length()-1; i>=0; i--) {
            for(int j=text2.length()-1; j>=0; j--) {
                if(text1.charAt(i) == text2.charAt(j)) dp[i][j] = 1 + dp[i+1][j+1];
                else dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j]);
            }
        }
        return dp[0][0];
    }
}
*/

// Space Optimization
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[]next = new int[text2.length()+1];
        for(int i=text1.length()-1; i>=0; i--) {
            int[]curr = new int[text2.length()+1];
            for(int j=text2.length()-1; j>=0; j--) {
                if(text1.charAt(i) == text2.charAt(j)) curr[j] = 1 + next[j+1];
                else curr[j] = Math.max(curr[j+1], next[j]);
            }
            next = curr;
        }
        return next[0];
    }
}