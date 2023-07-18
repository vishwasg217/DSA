import java.util.Arrays;

public class ContainsDuplicates 
{
    public int containsDuplicate(int[] nums) 
    {
        int n = nums.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans ^= nums[i];
        }
        return ans;
    }

    public static void main(String[] args)
    {
        ContainsDuplicates c = new ContainsDuplicates();
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(c.containsDuplicate(nums));
    }


    
}
