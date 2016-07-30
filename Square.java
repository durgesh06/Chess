public class Square{
  int rank;
    int file;
    Piece piece;

    public Spot(int rank, int file) {
        super();
        this.rank = rank;
        this.file = file;
        piece = null;
    }

    public void occupySquare(Piece piece){
        //if piece already here, delete it, i. e. set it dead
        if(this.piece != null)
            this.piece.setAvailable(false);
        //place piece here
        this.piece = piece;
    }
    
    public boolean isOccupied() {
        if(piece != null)
            return true;
        return false;
    }

    public Piece releaseSquare() {
        Piece releasedPiece = this.piece;
        this.piece = null;
        return releasedPiece;
    }

}
