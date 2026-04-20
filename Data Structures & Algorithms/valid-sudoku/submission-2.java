class Solution {
    public boolean isValidSudoku(char[][] board) {
        //row
        for(int i=0;i<board.length;i++){
            boolean[] row = new boolean[9];
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                int index = board[i][j] - '0';
                if(row[index-1]){
                    return false;
                }
                row[index-1]=true;
            }
        }
        //column
        for(int j=0;j<board[0].length;j++){
            boolean[] column = new boolean[9];
            for(int i=0;i<board.length;i++){
                if(board[i][j]=='.'){
                    continue;
                }
                int index = board[i][j] - '0';
                if(column[index-1]){
                    return false;
                }
                column[index-1]=true;
            }
        }
        //3x3 Submatrix
        for(int square=0;square<9;square++){
            boolean[] submatrix = new boolean[9];
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    int row = (square/3)*3+i;
                    int column = (square%3)*3+j;
                    if(board[row][column]=='.'){
                        continue;
                    }
                    int index = board[row][column] - '0';
                    if(submatrix[index-1]){
                        return false;
                    }
                    submatrix[index-1]=true;
                }
            }
        }
        return true;
    }
}
