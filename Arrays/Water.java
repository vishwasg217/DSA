public class Water 
{
    public int maxArea(int[] height) 
    {
        int n = height.length;
        int a = 0;
        int b = n-1;
        int ans = 0;
        while(a<b)
        {
            int water = (b-a)*Math.min(height[a], height[b]);
            ans = Math.max(water, ans);
            if(height[a] < height[b])
                a++;
            else
                b--;
        }  
        return ans;  
    }

    public static void main(String[] args) {
        Water w = new Water();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(w.maxArea(height));
    }
    
}
