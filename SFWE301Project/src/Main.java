 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.StageStyle;


public class Main extends Application {
 
 @Override
 public void start(Stage stage) {
  try {

   stage.initStyle(StageStyle.UNDECORATED);
   Parent root = FXMLLoader.load(getClass().getResource("fxml/Homepage.fxml"));
   Scene scene = new Scene(root);
   stage.setScene(scene);
 
   Screen screen = Screen.getPrimary();
   Rectangle2D bounds = screen.getVisualBounds();

   stage.setX(bounds.getMinX());
   stage.setY(bounds.getMinY());
   stage.setWidth(bounds.getWidth());
   stage.setHeight(bounds.getHeight());
   
   stage.show();
   
  } catch(Exception e) {
   e.printStackTrace();
  }
 } 

 public static void main(String[] args) {
  launch(args);
  
 }
}