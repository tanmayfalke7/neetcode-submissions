class Solution {

    private void dfs(char[][] grid, int r,int c){
        int rows = grid.length;
        int columns = grid[0].length;
        if(r<0||c<0||r>=rows||c>=columns||grid[r][c]=='0') return;
        grid[r][c] = '0';
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
}
