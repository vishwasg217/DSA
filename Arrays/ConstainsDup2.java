import java.util.HashMap;

public class ConstainsDup2 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        boolean flag = false;
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                if( Math.abs(map.get(nums[i]) - i) <= k)
                {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return flag;
    }

    public static void main(String[] args) {
        ConstainsDup2 s = new ConstainsDup2();
        int[] nums = {1,2,3,1,2,3};
        boolean ans = s.containsNearbyDuplicate(nums, 2);
        System.out.println(ans);
    }

    
}
