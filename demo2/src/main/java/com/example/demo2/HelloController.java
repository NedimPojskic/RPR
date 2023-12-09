package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    private TextField ime;

    @FXML
    private TextField prezime;

    @FXML
    private TextField email;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private ListView<String> userListView;

    private List<Korisnik> userList = new ArrayList<>();

    @FXML
    private void dodajClick(ActionEvent event) {
        clearFields();
        makeEditable(true);
    }

    @FXML
    private void krajClick(ActionEvent event) {
        Korisnik newUser = new Korisnik(ime.getText(), prezime.getText(), email.getText(), username.getText(), password.getText());
        userList.add(newUser);
        userListView.getItems().add(newUser.getUsername().get());
        makeEditable(false);
        clearFields();
    }
    private void makeEditable(boolean x) {
        ime.setEditable(x);
        prezime.setEditable(x);
        email.setEditable(x);
        username.setEditable(x);
        password.setEditable(x);
    }
    private void clearFields() {
        // Clear all input fields
        ime.clear();
        prezime.clear();
        email.clear();
        username.clear();
        password.clear();
    }
}