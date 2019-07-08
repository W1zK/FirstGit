package FXExampl;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PaintFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private void draw (Pane root) {
        Circle c1 = new Circle(250, 250, 100);

        c1.setFill(Paint.valueOf("#8cfffb"));


        root.getChildren().addAll(c1);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        draw(root);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
}
