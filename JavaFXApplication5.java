package javafxapplication5;

import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author jordan
 */
public class JavaFXApplication5 extends Application {
 
    
    @Override
public void start(Stage primaryStage) throws Exception{
  
    HBox left = new HBox();
    Button button1 = new Button("Ask Me");
    
    button1.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Random randomNum = new Random();
            int result = randomNum.nextInt(6);
            if (result == 1) {
                System.out.println("Most Likely");
                   
            }
            if (result == 2) {
                System.out.println("Maybe");
            }
            if (result == 3) {
                System.out.println("It is Certain");
            }
            if (result == 4) {
                System.out.println("Ask Again Later");
                   
            }
            if (result == 5) {
                System.out.println("Never");
            }
            if (result == 6) {
                System.out.println("Unlikely");
            }
               
        }
    });
    Button button2 = new Button("About");
    button2.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
           System.out.println("Think of a question in your head and then click 'ask me' to get an answer, the question has to have a yes or no answer");
        }
    });

    left.getChildren().addAll(button1,button2);
    

    BorderPane borderPane = new BorderPane();
    borderPane.setTop(topMenu);
    borderPane.setLeft(left);




    Scene scene = new Scene(borderPane, 300,300);

    primaryStage.setScene(scene);
    primaryStage.show();
}




public static void main(String[] args) {
    launch(args);
}
}
