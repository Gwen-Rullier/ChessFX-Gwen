package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class ChessController implements Initializable {

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



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        TextFieldTour.textProperty().addListener() ->

    }
}
