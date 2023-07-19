package Strings;

import java.util.HashMap;

public class Roman 
{
    public int romanToInt(String s) 
    {
        int n = s.length();
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);map.put('V',5);map.put('X',10);map.put('L',50);
        map.put('C',100);map.put('D',500);map.put('M',1000);

        for(int i=n-1;i>=0;i--)
        {
            if(i>0 && (map.get(s.charAt(i)) > map.get(s.charAt(i-1))))
            {
                ans += map.get(s.charAt(i)) - map.get(s.charAt(i-1));
                i--;
            }
            else
                ans += map.get(s.charAt(i));
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Roman r = new Roman();
        String s = "LVIII";
        int ans = r.romanToInt(s);
        System.out.println(ans);
    }
    
}
