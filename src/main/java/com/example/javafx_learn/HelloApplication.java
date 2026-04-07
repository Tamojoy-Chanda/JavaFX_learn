package com.example.javafx_learn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        StackPane sPane = new StackPane();
        sPane.getChildren().add(new Button("Stack Pane Button"));
        Scene sc = new Scene(sPane,440,320);
        Stage st = new Stage();
        st.setTitle("Experimenting with Stack pane");
        st.setScene(sc);
        st.show();
    }
}
