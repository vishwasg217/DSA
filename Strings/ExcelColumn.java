package Strings;

public class ExcelColumn {

    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int n = columnTitle.length();

        for(int i=n-1;i>=0;i--)
        {
            int c = (int)columnTitle.charAt(i) - 'A' + 1;
            ans += c*Math.pow(26, n-1-i);
        }
        return ans;

    }
    public static void main(String[] args) 
    {
        ExcelColumn ec = new ExcelColumn();
        String columnTitle = "ZY";
        int ans = ec.titleToNumber(columnTitle);
        System.out.println(ans);
    }
    
}
