package FXExampl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
//---------------------TEXT------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
        Text text = new Text("HELLO WORLD");
        text.setTranslateX(1000);
        text.setTranslateY(500);
 //------------------TEXTFIELD------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------
        TextField textIn = new TextField("100");
        textIn.setTranslateX(300);
        textIn.setTranslateY(100);



//----------------Button---------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------

        Button button = new Button("Добавить число");

        button.setTranslateX(50);
        button.setTranslateY(100);


        button.setOnMouseClicked((event) -> {
            String number = textIn.getText();
            String oldText = text.getText();
            text.setText(oldText + "\n" + number);

//            root.getChildren().addAll(text2);
        });

        root.getChildren().addAll(button, text, textIn);




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
