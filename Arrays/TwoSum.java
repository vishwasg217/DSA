class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSum2(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        for(int k=0;k<n;k++)
        {
            if(nums[i]+nums[j]>target)
                j--;
            else if(nums[i]+nums[j]<target)
                i++;
            else
                break;
        }
        return new int[]{i, j};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,2,4};
        int target = 6;
        int[] ans = s.twoSum(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}