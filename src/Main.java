import controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        ;
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(this.getClass().getResource("home.fxml"));

        StackPane stackPane = fxmlLoader.load();
        Controller controller = new Controller();
        fxmlLoader.setController(controller);
        Scene scene = new Scene(stackPane, 800, 600);
        stage.setTitle("SQLController v.0.0.1");
        stage.setScene(scene);
        stage.show();
    }
}
