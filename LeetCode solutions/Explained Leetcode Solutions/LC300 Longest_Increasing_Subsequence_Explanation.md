# Measuring Longest Increasing Subsequence Length

***1. Brute Force***
The simplest way is to compute all subsequences and check if they are increasing or not and then store the length of the longest increasing subsequences as our answer.

// TC = O(2^n)
// SC = O(n) recurrence stack space

Generate all subsequences and check for longest increasing subsequence at each instance.

**Observation:** Time Complexity is too high. We will surely get a TLE pursuing this approach.

---

***2. Recursion***

// TC = O(2^n)
// SC = O(n) recurrence stack space

```
class Solution {
    public int lengthOfLIS(int[] nums) {
        return getLIS(nums, -1, 0);
    }
    public int getLIS(int[]arr, int prev, int i){
        if(i == arr.length) return 0;
        
        int max = Integer.MIN_VALUE, inc = Integer.MIN_VALUE;
        
        if(prev == -1 || arr[i] > arr[prev]) inc = 1 + getLIS(arr, i, i+1);
        int ign = getLIS(arr, prev, i+1);
        
        return Math.max(inc, ign);
    }
}
```

**Observation:** Time Complexity is too high even with recursion. We get a TLE with this approach in the given testcases. Also, we see there are repeating subproblems in the recursion (Dry run a testcase to see repetition). Hence, we must memoize the solution. This increases the space complexity but reduces the time complexity considerably [ O(2^n) to O(n^2)].

---

***3. Memoization***

// TC = O(n^2)
// SC = O(n^2) + O(n)

```
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][]dp = new int[nums.length][nums.length];
        for(int[]arr:dp) Arrays.fill(arr, -1);
        return getLIS(nums, -1, dp, 0);
    }
    public int getLIS(int[]arr, int prev, int[][]dp, int i){
        if(i == arr.length) return 0;
        if(prev != -1 && dp[prev][i] != -1) return dp[prev][i];
        
        int max = Integer.MIN_VALUE, inc = Integer.MIN_VALUE;
        
        if(prev == -1 || arr[i] > arr[prev]) inc = 1 + getLIS(arr, i, dp, i+1);
        int ign = getLIS(arr, prev, dp, i+1);
        
        if(prev != -1) return dp[prev][i] = Math.max(inc, ign);
        return Math.max(inc, ign);
    }
}
```

**Observation:** Time Complexity boils down to O(n^2) which passes all testcases but takes 1688 ms time. May be reduceable further if we observe the problem carefully. Also, we can remove the recursion stack space by tabulation (though the time complexity would remain the space).

---

***4. Tabulation***

// TC = O(n^2)
// SC = O(n^2)

```
class Solution {
    public int lengthOfLIS(int[] arr) {
        int[][]dp = new int[arr.length + 1][arr.length + 1];
        
        for(int i = arr.length-1; i >= 0; i--){
            for(int prev = i-1; prev >= -1; prev--){    // as prev can start from i-1 as it is previous of current element
                int inc = Integer.MIN_VALUE;
        
                if(prev == -1 || arr[i] > arr[prev]) inc = 1 + dp[i+1][i+1];
                int ign = dp[i+1][prev+1];

                dp[i][prev+1] = Math.max(inc, ign);
            }
        }
        return dp[0][0];
    }
}
```

**Observation:** Time Complexity remains O(n^2) and all testcases pass. The time taken is 626 ms. Space complexity is reduced as we no longer require the recurrence stack space. Also, we can  reduce the 2D dp to two 1D dp arrays as we only require the previously filled row for calculating the current row.

---

***5. Spatial optimization***
// TC = O(n^2)
// SC = O(n)
```
class Solution {
    public int lengthOfLIS(int[] arr) {
        int[]pre = new int[arr.length + 1];
        
        for(int i = arr.length-1; i >= 0; i--){     // as prev can start from i-1 as it is previous of current element
            int[]curr = new int[arr.length + 1];
            for(int prev = i-1; prev >= -1; prev--){
                int inc = Integer.MIN_VALUE;
        
                if(prev == -1 || arr[i] > arr[prev]) inc = 1 + pre[i+1];
                int ign = pre[prev+1];

                curr[prev+1] = Math.max(inc, ign);
            }
            pre = curr;
        }
        return pre[0];
    }
}
```
**Observation:** Time Complexity remains O(n^2) and all testcases pass. The time taken is 245 ms. The space consumed is further reduced as we only carry two 1D dp array rows instead of the entire 2D array.

---

***6. Another Approach***
// TC = O(n^2)
// SC = O(n)
```
class Solution {
    public int lengthOfLIS(int[] arr) {
        int amax = 1;
        int[]dp = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int max = 0;
            for(int j=0; j<i; j++){
                if(arr[j] < arr[i]) max = Math.max(max, dp[j]);
            }
            dp[i] = max+1;
            amax = Math.max(amax, dp[i]);
        }    
        return amax;
    }
}
```
**Observation:** After watching some solution videos and reading the discuss forums, I realized that we can begin from the zeroth index and at every index, traerse the array till current index and get the previous index with the longest subsequence till now having value smaller than the current index value. Time Complexity remains O(n^2) and all testcases pass. The time taken is 63 ms.
After observing approach 6 carefully, we can see that we do not actually need to traverse the entire previous array in order to check wether the current element can be paired with any previous elements. But, we can instead use a single traversal, allocating values to the binary searched locations (if location == al.size(), we simply insert the element into the al). Lastly, we can return the size of the arraylist.

---

***7. Optimal Approach (Using Binary Search)***
// TC = O(n logn)
// SC = O(n)
```
class Solution {
    public int lengthOfLIS(int[] arr) {
        List<Integer>al = new ArrayList<>();
        al.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i] > al.get(al.size()-1)) al.add(arr[i]);
            else{
                int j = binSearch(al, arr[i]);
                al.set(j, arr[i]);
            }
        }
        return al.size();
    }
    public int binSearch(List<Integer>al, int val){
        int lo = 0;
        int hi = al.size()-1;
        while(hi > lo){
            int mid = lo + (hi-lo)/2;
            if(al.get(mid) < val) lo = mid+1;
            else hi = mid;
        }
        return hi;
    }
}
```
**Observation:** The time complexity boils down to O(nlogn) as we perform binary search for n nodes. This reduces the time taken drastically and leads to a net time consumption of 2-4ms. This, according to my understanding, is the optimal approach to the question.
# Printing LIS
A way to print the LIS is to maintain the LIS while looping for the LIS as shown under.
***1. Way 1:***
```
class Solution {
    public int lengthOfLIS(int[] arr) {
        String amax = Integer.toString(arr[0]);
        String[]dp = new String[arr.length];
        for(int i=0; i<arr.length; i++){
            String val = Integer.toString(arr[i]);
            String max = val;
            for(int j=0; j<i; j++) if(arr[j] < arr[i] && dp[j].length() + 1 > max.length()) max = dp[j] +", "+ val;
            dp[i] = max;
            if(dp[i].length() > amax.length()) amax = dp[i];
        }    
        System.out.println(amax);
        return amax.split(" ").length;
    }
}
```

The second way uses the tabulation table (dp) to generate the resultant LIS string. Make sure you have understood the tabulation code before pursuing the undermentioned algorithm for string generation.
***2. Another Way to print LIS (preferred as we can store ans as array / list directly)***
```
class Solution {
    public int lengthOfLIS(int[] arr) {
        int max = 1, lastidx = 0;
        
        int[]dp = new int[arr.length];
        Arrays.fill(dp,1);
        
        int[]hash = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            hash[i] = i;
            for(int j=0; j<i; j++){
                if(arr[j] < arr[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    hash[i] = j;
                }
            }
            
            if(dp[i] > max){
                lastidx = i;
                max = dp[i];
            }
        }
        
        int[]ans = new int[max];
        int i = max-1;
        
        while(hash[lastidx] != lastidx){
            ans[i--] = arr[lastidx];
            lastidx = hash[lastidx];
        }
        ans[0] = arr[lastidx];
        
        for(int val:ans) System.out.print(val + " ");
        System.out.println();
        
        return max;
    }
}
```
