class Solution {
    public boolean isValidSudoku(char[][] board) {
        //checking row
        int m = board.length, n = board[0].length;
        for(int i=0;i<m;i++){
            boolean[] row = new boolean[9];
            for(int j=0;j<n;j++){
                if(board[i][j]!='.'){
                    int num = board[i][j]-'0';
                    if(!row[num-1]){
                            row[num-1]=true;
                    }else{
                        return false;
                    }
                }
            }
        }
        //checking column
        for(int j=0;j<n;j++){
            boolean[] column = new boolean[9];
            for(int i=0;i<m;i++){
                if(board[i][j]!='.'){
                    int num = board[i][j]-'0';
                    if(!column[num-1]){
                            column[num-1]=true;
                    }else{
                        return false;
                    }
                }
            }
        }
        //checking 3x3 sub-matrix
        for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int r = (square / 3) * 3 + i;
                    int c = (square % 3) * 3 + j;
                    if (board[r][c] == '.') continue;
                    if (seen.contains(board[r][c])) return false;
                    seen.add(board[r][c]);
                }
            }
        }

        return true;
    }
}
