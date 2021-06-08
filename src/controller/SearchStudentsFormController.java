package controller;

import com.jfoenix.controls.JFXTreeTableView;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import util.MaterialUI;

public class SearchStudentsFormController {
    public TextField txtSearch;
    public TableView<String[]> tblSearch;

    public void initialize(){
        tblSearch.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("0"));
        MaterialUI.paintTextFields(txtSearch);
        ObservableList<String[]> items = tblSearch.getItems();
        items.add(new String[]{"asd","asdas","ASdas","Asdsa"});
    }
}
