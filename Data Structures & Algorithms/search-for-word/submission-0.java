class Solution {
    public boolean backtrack(int i, int j, int k, char[][] board, String word){
        if(k==word.length()) return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length) return false;
        if(board[i][j]!=word.charAt(k)) return false;
        char temp = board[i][j];
        board[i][j] = '#';
        boolean found = backtrack(i+1,j,k+1,board,word)||
                        backtrack(i-1,j,k+1,board,word)||
                        backtrack(i,j+1,k+1,board,word)||
                        backtrack(i,j-1,k+1,board,word);
        board[i][j] = temp;
        return found;
    }
    
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(backtrack(i,j,0,board,word)) return true;
            }
        }
        return false;
    }
}
