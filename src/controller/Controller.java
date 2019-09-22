package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import sql.SQLController;


public class Controller {
    @FXML
    public Text statusConnectionT;
    @FXML
    private Button loginBTN;
    @FXML
    private TextField rootTF;
    @FXML
    private TextField passwordTF;
    @FXML
    private TextField hostTF;

    private  SQLController sqlController;

    public Controller() {
        sqlController = new SQLController();
        System.out.println("Start controller");
    }

    @FXML
    void initialize() {
        loginBTN.setOnAction(e -> {
            String root, password, host;
            root = rootTF.getText();
            password = passwordTF.getText();
            host = hostTF.getText();
            statusConnectionT.setText("Status connection: " + sqlController.connection(host, root, password));
        });
    }
}
