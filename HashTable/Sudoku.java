package HashTable;

import java.util.HashSet;

public class Sudoku 
{
    public boolean isValidSudoku(char[][] board) 
    {
        int n = board.length;
        boolean flag = true;

        for(int i=0;i<n;i++)
        {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> box = new HashSet<>();

            for(int j=0;j<n;j++)
            {   
                if(row.contains(board[i][j]))
                    return false;
                else if(board[i][j] != '.')
                    row.add(board[i][j]);

                if(col.contains(board[j][i]))
                    return false;
                else if(board[j][i] != '.')
                    col.add(board[j][i]);

                int rowStart = 3 * (i/3);
                int colStart = 3 * (i%3);

                if(box.contains(board[rowStart + j/3][colStart + j%3]))
                {
                    return false;
                }
                else if(board[rowStart + j/3][colStart + j%3] != '.')
                    box.add(board[rowStart + j/3][colStart + j%3]);                
            }

        }
        return flag;
    }


    public static void main(String[] args) 
    {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}};

        Sudoku s = new Sudoku();
        System.out.println(s.isValidSudoku(board));
    }
}
