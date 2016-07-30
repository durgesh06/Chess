/**
 * Created by kumardu on 7/30/2016.
 */
public class Knight extends Piece{

    public Knight(boolean available, int rank, int file) {
        super(available, rank, file);
    }

    @Override
    public boolean isValid(Board board, int fromRank, int fromFile, int toRank, int toFile) {
        if(super.isValid(board, fromRank, fromFile, toRank, toFile) == false)
            return false;

        if(toRank != fromRank - 1 && toRank != fromRank + 1 && toRank != fromRank + 2 && toRank != fromRank - 2)
            return false;
        if(toFile != fromFile - 2 && toFile != fromFile + 2 && toFile != fromFile - 1 && toFile != fromFile + 1)
            return false;

        return true;
    }

}
