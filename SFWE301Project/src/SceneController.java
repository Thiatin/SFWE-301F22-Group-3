import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

 private Stage stage;
 private Scene scene;
 private Parent root;
 
 public void navHomepage(ActionEvent event) throws IOException {
  root = FXMLLoader.load(getClass().getResource("fxml/Homepage.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }

 public void navClubs(ActionEvent event) throws IOException {
   root = FXMLLoader.load(getClass().getResource("fxml/Clubs.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
 }
 public void navResources(ActionEvent event) throws IOException {
   root = FXMLLoader.load(getClass().getResource("fxml/Resources.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}
 
 public void navActivities(ActionEvent event) throws IOException {
  root = FXMLLoader.load(getClass().getResource("fxml/Activities.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }

 public void navStaff(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("fxml/Staff.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
 }

 public void navAbout(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("fxml/About.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }

}