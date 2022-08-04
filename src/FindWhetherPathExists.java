public class FindWhetherPathExists {



    static boolean dfs(int sr, int sc, int n, int m, int[][] grid){
        //if the element is out of the grid or its 0 then return false, if its 2 then return true
        if(sr<0 || sc<0 || sr== n|| sc ==m|| grid[sr][sc]==0){
            return false;
        }
        if(grid[sr][sc]==2){
            return true;
        }

        //update the grid everytime during the search to 0, so that it cannot come back
        grid[sr][sc] = 0;


        //search up, down, right and left for the result
     boolean a=   dfs(sr+1, sc, n, m , grid);
    boolean b=     dfs(sr-1, sc, n, m , grid);
      boolean c=  dfs(sr, sc+1, n, m , grid);
       boolean d= dfs(sr, sc-1, n, m , grid);


       // if either of the search turns to be true then return true
       return (a||b||c||d);
    }

public static boolean findWhetherPathExists(int [][] grid){
        //get length of row and column

    int n = grid.length;
    int m = grid[0].length;

    int sr=0, sc=0;

    // find the row and column number of the source, and then run a dfs to find the destination
    //return true if you find it return false otherwise
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
