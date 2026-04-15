class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Brute Force
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{};
       
       //Time Complexity: O(n²)
       
       //Best Optimized (HashMap)
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remaining = target-nums[i];
            if(map.containsKey(remaining)){
                return new int[] {map.get(remaining),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};

//         Complexity:
//         Time: O(n) 
//         Space: O(n)
    }
}
