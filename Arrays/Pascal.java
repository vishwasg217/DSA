public class Pascal {

    public int[][] pascal(int numRows)
    {
        int[][] pascal = new int[numRows][];

        int[] one = new int[1];
        one[0] = 1;
        pascal[0] = one;
        if(numRows==1)
        {
            return pascal;
        }

        int[] two = new int[2];
        two[0] = 1;
        two[1] = 1;

        pascal[1] = two;

        if(numRows == 2)
            return pascal;

        for(int i=2;i<numRows;i++)
        {
            int[] temp = new int[i+1];
            temp[0] = 1;
            temp[temp.length-1] = 1;

            for(int j=1;j<temp.length-1; j++)
            {
                temp[j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
            pascal[i] = temp;
        }

        return pascal;
    }

    public static void main(String[] args)
    {
        Pascal p = new Pascal();
        int[][] pascal = p.pascal(6);
        for(int i=0;i<pascal.length;i++)
        {
            for(int j=0;j<pascal[i].length;j++)
            {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    
    }
    
}
