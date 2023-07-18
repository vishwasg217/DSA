class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;
    for (int n : nums)
        if (i == 0 || n > nums[i-1])
            nums[i++] = n;
    return i;
    }

    public static void main(String[] args) {
        RemoveDuplicates s = new RemoveDuplicates();
        int[] nums = {1, 1, 2};
        int ans = s.removeDuplicates(nums);
        System.out.println(ans);
    }
}