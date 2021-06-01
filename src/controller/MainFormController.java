package controller;

import com.jfoenix.controls.JFXRippler;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {

    public JFXRippler rprAddNewStudent;
    public AnchorPane pneAddNewStudent;
    public JFXRippler rprSearchStudents;
    public AnchorPane pneSearchStudents;

    public void initialize(){
        rprAddNewStudent.setControl(pneAddNewStudent);
        rprSearchStudents.setControl(pneSearchStudents);
        pneAddNewStudent.setFocusTraversable(true);
        pneSearchStudents.setFocusTraversable(true);
    }

    public void pneAddNewStudent_OnKeyPress(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER || keyEvent.getCode() == KeyCode.SPACE){
            rprAddNewStudent.createManualRipple().run();
        }
    }

    public void pneSearchStudents_OnKeyPress(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER || keyEvent.getCode() == KeyCode.SPACE){
            rprSearchStudents.createManualRipple().run();
        }
    }

    public void pneSearchStudents_OnMouseClicked(MouseEvent mouseEvent) {
        navigate("Search Students", "/view/SearchStudentsForm.fxml");
    }

    public void pneAddNewStudent_OnMouseClicked(MouseEvent mouseEvent) throws IOException {
        navigate("Add New Student", "/view/StudentForm.fxml");
    }

    private void navigate(String title, String url){
        try {
            Parent root = FXMLLoader.load(this.getClass().getResource(url));
            Scene addNewStudentScene = new Scene(root);
            Stage primaryStage = (Stage) (rprAddNewStudent.getScene().getWindow());
            primaryStage.setResizable(true);
            primaryStage.setScene(addNewStudentScene);
            primaryStage.setTitle(title);
            primaryStage.centerOnScreen();
            Platform.runLater(() -> primaryStage.setResizable(false));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void pneAddNewStudent_OnKeyReleased(KeyEvent keyEvent) throws IOException {
        if (keyEvent.getCode() == KeyCode.ENTER || keyEvent.getCode() == KeyCode.SPACE){
            navigate("Add New Student", "/view/StudentForm.fxml");
        }
    }

    public void pneSearchStudents_OnKeyReleased(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER || keyEvent.getCode() == KeyCode.SPACE){
            navigate("Search Students", "/view/SearchStudentsForm.fxml");
        }
    }
}
