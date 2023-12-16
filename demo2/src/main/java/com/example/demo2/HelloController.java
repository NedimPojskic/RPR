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
        if(ime.getText().isEmpty() || prezime.getText().isEmpty() || email.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty()) {
           return;
        }
        Korisnik newUser = new Korisnik(ime.getText(), prezime.getText(), email.getText(), username.getText(), password.getText());
        userList.add(newUser);
        userListView.getItems().add(newUser.getUsername().get());
        clearFields();
    }

    @FXML
    public void initialize() {
        userListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                Korisnik selectedKorisnik = findKorisnikByUsername(newValue);
                if (selectedKorisnik != null) {
                    ime.setText(selectedKorisnik.getIme().get());
                    prezime.setText(selectedKorisnik.getPrezime().get());
                    email.setText(selectedKorisnik.getEmail().get());
                    username.setText(selectedKorisnik.getUsername().get());
                    password.setText(selectedKorisnik.getPassword().get());
                }
            }
        });
    }

    private Korisnik findKorisnikByUsername(String username) {
        return userList.stream()
                .filter(korisnik -> korisnik.getUsername().get().equals(username))
                .findFirst()
                .orElse(null);
    }

    @FXML
    private void krajClick(ActionEvent event) {
        clearFields();
        javafx.application.Platform.exit();
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