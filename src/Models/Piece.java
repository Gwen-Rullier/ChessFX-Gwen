package Models;

public class Piece {

    boolean estBlanc;
    String imagePiece; //unicode de la piece

    public Piece(boolean estBlanc, String imagePiece) {
        this.estBlanc = estBlanc;
        this.imagePiece = imagePiece;
    }

    public Piece(boolean estBlanc) {
    }

    public boolean getEstBlanc() {
        return estBlanc;
    }
    public String getImagePiece() {
        return imagePiece;
    }

    public  void dessiner(){

    }
    public boolean deplacementValide(int departLigne, int departColonne, int arriveeligne, int arriveColonne){

        return false;
    }
}


