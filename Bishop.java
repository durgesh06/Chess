/**
 * Created by kumardu on 7/30/2016.
 */
public class Bishop extends Piece{

    public Bishop(boolean available, int rank, int file) {
        super(available, rank, file);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public boolean isValid(Board board, int fromRank, int fromfile, int toRank, int tofile) {
        if(super.isValid(board, fromRank, fromFile, toRank, toFile) == false)
            return false;

        if(toRank - fromRank == toFile - fromFile)
            return true;

        return false;
    }


}
