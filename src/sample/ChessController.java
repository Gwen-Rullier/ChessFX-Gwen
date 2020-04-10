package sample;

import Models.CaseEchiquier;
import Models.Piece;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ChessController implements Initializable {

    @FXML
    private Label label11, label12,label13,label14,label15,label16,label17,label18;
    @FXML
    private Label label21,label22,label23,label24,label25,label26,label27,label28;
    @FXML
    private Label label31,label32,label33,label34,label35,label36,label37,label38;
    @FXML
    private Label label41,label42,label43,label44,label45,label46,label47,label48;
    @FXML
    private Label label51,label52,label53,label54,label55,label56,label57,label58;
    @FXML
    private Label label61,label62,label63,label64,label65,label66,label67,label68;
    @FXML
    private Label label71,label72,label73,label74,label75,label76,label77,label78;
    @FXML
    private Label label81,label82,label83,label84,label85,label86,label87,label88;

    @FXML
    private Rectangle A1,A2,A3,A4,A5,A6,A7,A8;

    @FXML
    private Rectangle B1,B2,B3,B4,B5,B6,B7,B8;

    @FXML
    private Rectangle C1,C2,C3,C4,C5,C6,C7,C8;

    @FXML
    private Rectangle D1,D2,D3,D4,D5,D6,D7,D8;

    @FXML
    private Rectangle E1,E2,E3,E4,E5,E6,E7,E8;

    @FXML
    private Rectangle F1,F2,F3,F4,F5,F6,F7,F8;

    @FXML
    private Rectangle G1,G2,G3,G4,G5,G6,G7,G8;

    @FXML
    private Rectangle H1,H2,H3,H4,H5,H6,H7,H8;

    @FXML
    private Button btnAnnuler, btnNew, btnQuit ;

    @FXML
    private TextField TextFieldTour;

    // creation des pièces
    Piece tourNoir = new Piece(false,"\u265C");
    Piece tourBlanc = new Piece(true,"\u2656");
    Piece cavalierNoir = new Piece(false,"\u265E");
    Piece cavalierBlanc = new Piece(false,"\u2658");
    Piece fouNoir = new Piece(false,"\u265D");
    Piece fouBlanc = new Piece(false,"\u2657");
    Piece reineNoir = new Piece(false,"\u265B");
    Piece reineBlanc = new Piece(false,"\u2655");
    Piece roiNoir = new Piece(false,"\u265A");
    Piece roiBlanc = new Piece(false,"\u2654");
    Piece pionNoir = new Piece(false,"\u265F");
    Piece pionBlanc = new Piece(false,"\u2659");
    Piece pieceNul = new Piece (false,"");

    ArrayList<String> plateau = new ArrayList<>();
    ArrayList<Label> monLabel = new ArrayList<>();

    CaseEchiquier case1 = new CaseEchiquier(1,1,tourNoir);




    public void initPlateau()  {

        plateau.add("\u265C");
        plateau.add("\u265E");
        plateau.add("\u265D");
        plateau.add("\u265B");
        plateau.add("\u265A");
        plateau.add("\u265D");
        plateau.add("\u265E");
        plateau.add("\u265C");
        for (int i = 1; i < 9; i++) {
            plateau.add("\u265F");
        }
        for (int i = 1; i < 33; i++) {
            plateau.add("");
        }
        for (int i = 1; i < 9; i++) {
            plateau.add("\u2659");
        }
        plateau.add("\u2656");
        plateau.add("\u2658");
        plateau.add("\u2657");
        plateau.add("\u2655");
        plateau.add("\u2654");
        plateau.add("\u2657");
        plateau.add("\u2658");
        plateau.add("\u2656");

        monLabel.add(label11);
        monLabel.add(label12);
        monLabel.add(label13);
        monLabel.add(label14);
        monLabel.add(label15);
        monLabel.add(label16);
        monLabel.add(label17);
        monLabel.add(label18);

        monLabel.add(label21);
        monLabel.add(label22);
        monLabel.add(label23);
        monLabel.add(label24);
        monLabel.add(label25);
        monLabel.add(label26);
        monLabel.add(label27);
        monLabel.add(label28);

        monLabel.add(label31);
        monLabel.add(label32);
        monLabel.add(label33);
        monLabel.add(label34);
        monLabel.add(label35);
        monLabel.add(label36);
        monLabel.add(label37);
        monLabel.add(label38);

        monLabel.add(label41);
        monLabel.add(label42);
        monLabel.add(label43);
        monLabel.add(label44);
        monLabel.add(label45);
        monLabel.add(label46);
        monLabel.add(label47);
        monLabel.add(label48);

        monLabel.add(label51);
        monLabel.add(label52);
        monLabel.add(label53);
        monLabel.add(label54);
        monLabel.add(label55);
        monLabel.add(label56);
        monLabel.add(label57);
        monLabel.add(label58);

        monLabel.add(label61);
        monLabel.add(label62);
        monLabel.add(label63);
        monLabel.add(label64);
        monLabel.add(label65);
        monLabel.add(label66);
        monLabel.add(label67);
        monLabel.add(label68);

        monLabel.add(label71);
        monLabel.add(label72);
        monLabel.add(label73);
        monLabel.add(label74);
        monLabel.add(label75);
        monLabel.add(label76);
        monLabel.add(label77);
        monLabel.add(label78);

        monLabel.add(label81);
        monLabel.add(label82);
        monLabel.add(label83);
        monLabel.add(label84);
        monLabel.add(label85);
        monLabel.add(label86);
        monLabel.add(label87);
        monLabel.add(label88);





    }

    public String convertUnicode(String strUnicode) throws UnsupportedEncodingException {

        byte[] charset = strUnicode.getBytes("UTF-8");
        String result = new String(charset, "UTF-8");
        return result;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            initPlateau();
            for (int i = 0; i < plateau.size(); i++) {
                (monLabel.get(i)).setText(convertUnicode(plateau.get(i)));
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //TextFieldTour.textProperty().addListener()LIGHTSLATEGRAY

    }




}
