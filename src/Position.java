/**
 * Created by home on 4/3/2017.
 */
public class Position {
    public int []piece;

    public Position(){
        piece = new int[2];
    }
    private void addPiece(int i, int j){
        piece[0] =i;
        piece[1] = j;
    }
    public int[] getPiece() {
        return piece;
    }
}
