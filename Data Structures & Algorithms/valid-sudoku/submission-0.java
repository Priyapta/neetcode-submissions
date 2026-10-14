class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for (int i = 0 ; i < board.length;i++){

            for (int j = 0 ; j < 9;j++){
                int boxIndex = (i / 3) * 3 + (j / 3);
                int index = board[i][j] - '1';
                if (board[i][j] == '.') {
                    continue;
                }
                if (rows[i][index] ||
                    cols[j][index] ||
                    boxes[boxIndex][index]) {
                    return false;
                }
                
                    rows[i][index] = true;
                    cols[j][index] = true;
                    boxes[boxIndex][index] = true;
                
               




            }

           
        }
        return true;
        
    }
}
