package FXExampl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainFX extends Application {

    private static final int WIDTH = 1366;
    private static final int HEIGHT = 768;


    public static void main(String[] args) {
        launch(args);    }

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGHT);

        primaryStage.setMaxWidth(WIDTH);
        primaryStage.setMaxHeight(HEIGHT);

        primaryStage.setMinWidth(WIDTH);
        primaryStage.setMinHeight(HEIGHT);



    }

    void uiSetup(Pane root) {
        Text text = new Text("HELLO WORLD");
        text.setTranslateX(1000);
        text.setTranslateY(500);
//        text.setTranslateZ(150);

        Button button = new Button("Добавить число");

        button.setTranslateX(50);
        button.setTranslateY(100);

        root.getChildren().addAll(button, text);


    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        windowSetup(primaryStage);
        Pane root = new Pane();
        uiSetup(root);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);





        primaryStage.show();

    }
}
