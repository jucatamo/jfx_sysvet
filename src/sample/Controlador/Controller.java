package sample.Controlador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import sample.Controlador.formCallController;

public class Controller {
    formCallController cargarInterfaz = new formCallController();
    @FXML private TitledPane loginPanel;
    @FXML private GridPane menuGrid;
    @FXML private GridPane menu;
    @FXML protected void loginClick(ActionEvent event) {

        menu = cargarInterfaz.loadChild(menu, ("../Vista/menuVista.fxml"));
        menuGrid.getChildren().add(menu);
        loginPanel.setDisable(true);
        loginPanel.setVisible(false);
    }
}