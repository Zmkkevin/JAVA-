package Swardtooffer;

public class offer14_robot {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int res =  dfs(0,0,m,n,k,visited);
        return res;
    }
    private int dfs(int i, int j, int m, int n, int k, boolean visited[][]){
        if(i < 0 || i >= m || j < 0 || j >= n || (i/10 + i%10 +j/10 + j%10) > k || visited[i][j]){
            return 0;
        }
        visited[i][j] = true;
        return dfs(i+1,j,m,n,k,visited) + dfs(i-1,j,m,n,k,visited) +dfs(i,j+1,m,n,k,visited)
                +dfs(i+1,j-1,m,n,k,visited);
    }
}
