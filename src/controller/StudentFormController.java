package controller;

import javafx.scene.control.TextField;
import util.MaterialUI;

public class StudentFormController {
    public TextField txtNic;
    public TextField txtFullName;
    public TextField txtAddress;
    public TextField txtDateOfBirth;
    public TextField txtContactNumber;
    public TextField txtEmail;

    public void initialize() {
        MaterialUI.paintTextFields(txtNic, txtFullName,txtAddress,txtDateOfBirth,txtContactNumber,txtEmail);
    }
}
