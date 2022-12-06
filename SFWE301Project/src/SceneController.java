import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SceneController {

 private Stage stage;
 private Scene scene;
 private Parent root;

 private Button leftPhotoButton;
 private Button rightPhotoButton;
 
 public void navHomepage(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/Homepage.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
 }
    
    public void navAcademics(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/Academics.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }

 
    public void navActivities(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/Activities.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }


    public void navClubs(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/Clubs.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }

    public void navProgram(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/Program.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }

    public void navStaff(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/Staff.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }

    public void navActivitiesQ1(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/ActivitiesQ1.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }

    public void navActivitiesQ2(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/ActivitiesQ2.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }

    public void navActivitiesQ3(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/ActivitiesQ3.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }

    public void navActivitiesQ1w(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/ActivitiesQ1w.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }

    public void navActivitiesQ2w(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/ActivitiesQ2w.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }

    public void navActivitiesQ3w(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/ActivitiesQ3w.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }

    public void navCheck1(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/Check1.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }
    
    public void navCheck2(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/Check2.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }

    public void navCheck3(ActionEvent event) throws IOException {
      root = FXMLLoader.load(getClass().getResource("fxml/Check3.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      stage.getScene().setRoot(root);
    }

}