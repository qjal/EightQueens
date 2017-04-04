/**
 * Created by home on 4/4/2017.
 */
public class HillClimbing {

    public int[][]board;
     public int[][]conflicts;

     public HillClimbing(int n){
         board = new int[n][n];
         conflicts = new int[n][n];
     }

     private void addQueen(int i, int j){
         board[i][j] = 1;
     }
     private void addConflicts( int j){

     }
     /*
     * check in each column of the row and add total conflicts value
      */
     private int checkRow(int i){
         int total = 0;
         for (int j = 0; j<  board.length; j++){
             if(board[i][j] ==1){
                 total += 1;
             }
         }
         return total;
     }
    /*
    * check in each row of the column and add total conflicts value
     */
     private int checkcolumn(int j){
         int total = 0;
         for (int i = 0; i<board.length; i++){
             if(board[i][j] ==1){
                 total += 1;
             }
         }
         return total;
     }
     private int checkUpRight(int i, int j){
         int total = 0;
         int x = i-1;
         int y = j+1;
         while(x>0&&y<board.length) {
             if(board[i][j] ==1){
                 total += 1;
             }
             x--;
             y++;
         }
         return total;
     }
    private int checkUpLeft(int i, int j){
        int total = 0;
        int x = i-1;
        int y = j-1;
        while(x>0&&y>0) {
            if(board[i][j] ==1){
                total += 1;
            }
            x--;
            y--;
        }
        return total;
    }
    private int checkBottomLeft(int i, int j){
        int total = 0;
        int x = i+1;
        int y = j-1;
        while(x<board.length&&y>0) {
            if(board[i][j] ==1){
                total += 1;
            }
            x++;
            y--;
        }
        return total;
    }
    private int checkBottomRight(int i, int j){
        int total = 0;
        int x = i+1;
        int y = j+1;
        while(x<board.length&&y<board.length) {
            if(board[i][j] ==1){
                total += 1;
            }
            x++;
            y++;
        }
        return total;
    }
    private int totalconflict(int i, int j){
        int total = 0;
        total+= checkRow(i);
        total+= checkUpLeft(i,j);
        total += checkUpRight(i,j);
        total+= checkBottomRight(i,j);
        total+= checkBottomLeft(i,j);

        return total;
    }
}
