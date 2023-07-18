import java.util.Arrays;

public class MajorityEle {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[(n-1)/2];
    }

    public static void main(String[] args)
    {
        MajorityEle m = new MajorityEle();
        int[] nums = {3,2,3};
        System.out.println(m.majorityElement(nums));
    }
    
}
