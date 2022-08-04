public class FindWhetherPathExists {



    static boolean dfs(int sr, int sc, int n, int m, int[][] grid){
        if(sr<0 || sc<0 || sr== n|| sc ==m|| grid[sr][sc]==0){
            return false;
        }
        if(grid[sr][sc]==2){
            return true;
        }

        grid[sr][sc] = 0;

     boolean a=   dfs(sr+1, sc, n, m , grid);
    boolean b=     dfs(sr-1, sc, n, m , grid);
      boolean c=  dfs(sr, sc+1, n, m , grid);
       boolean d= dfs(sr, sc-1, n, m , grid);

       return (a||b||c||d);
    }

public static boolean findWhetherPathExists(int [][] grid){

    int n = grid.length;
    int m = grid[0].length;

    int sr=0, sc=0;

    for(int i =0; i<n; i++){
        for(int j=0; j<m; j++){
            if(grid[i][j]== 1){
                sr=i;
                sc=j;
                break;
            }
        }
    }

    return dfs(sr, sc, n, m, grid);





}



    public static void main(String[] args) {

    }
}
