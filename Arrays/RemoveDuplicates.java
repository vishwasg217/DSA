import java.util.HashSet;

class RemoveDuplicates {
    public boolean removeDuplicates(int[] nums) 
    {
        boolean flag = false;
        int n = nums.length;

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return flag;
    }

    public static void main(String[] args) {
        RemoveDuplicates s = new RemoveDuplicates();
        int[] nums = {1,2,3,4};
        boolean ans = s.removeDuplicates(nums);
        System.out.println(ans);
    }
}