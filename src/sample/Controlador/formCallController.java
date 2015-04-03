package sample.Controlador;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.control.TitledPane;
        import javafx.scene.layout.GridPane;
        import javafx.scene.layout.Pane;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import java.awt.*;
        import java.io.IOException;

/**
 * Created by Juan on 02/04/2015.
 */
public class formCallController {

    public GridPane loadChild(GridPane pane, String location) {

        try {
            pane = FXMLLoader.load(getClass().getResource(location), null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pane;
    }
}
