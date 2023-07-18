public class RemoveEle 
{
    public int removeElement(int[] nums, int val) 
    {
        int k = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
                nums[k++] = nums[i];
        }
        return k;
    }

    public static void main(String[] args) 
    {
        RemoveEle s = new RemoveEle();
        int[] nums = {0,1,2,2,3,0,4,2};
        int ans = s.removeElement(nums,2);
        System.out.println(ans);
    }
    
}
