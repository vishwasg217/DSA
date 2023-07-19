package Strings;

public class CommonPrefix 
{
    public String longestCommonPrefix(String[] strs) {
        
        int n  = strs.length;
        int minLength = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            minLength = Math.min(minLength,strs[i].length());
        }

        String ans = "";
        for(int i=0;i<minLength;i++)
        {
            char c = strs[0].charAt(i);
            for(int j=1;j<n;j++)
            {
                if(strs[j].charAt(i) != c)
                    return ans;
            }
            ans += c;
        }
        return ans;
    }

    public static void main(String[] args)
    {
        CommonPrefix cp = new CommonPrefix();
        String[] strs = {"dog","racecar","car"};
        String ans = cp.longestCommonPrefix(strs);
        System.out.println(ans);
    }
}
