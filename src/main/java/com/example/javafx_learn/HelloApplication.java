package com.example.javafx_learn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
//        stage.show();

        StackPane sPane = new StackPane();
        sPane.getChildren().add(new Button("Stack Pane Button"));
        Scene sc = new Scene(sPane,440,320);
        Stage st = new Stage();
        st.setTitle("Experimenting with Stack pane");
        st.setScene(sc);
//        st.show();

        Circle circle = new Circle();
        circle.setCenterX(250);
        circle.setCenterY(250);
        circle.setRadius(50);
        circle.setStroke(Color.LAVENDER);
        circle.setFill(Color.CORAL);
        Pane p = new Pane();
        p.getChildren().add(circle);
        Scene sc1 = new Scene(p,500,500);
        Stage stage2 = new Stage();
        stage2.setScene(sc1);
        stage2.setTitle("Learning Pane and Circle");
//        stage2.show();

//        the binding property
        Pane p10 = new Pane();
        Scene sc10 = new Scene(p10,500,500);
        Circle circle10 = new Circle();
        circle10.centerXProperty().bind(p10.widthProperty().divide(2));
        circle10.centerYProperty().bind(p10.heightProperty().divide(2));
        circle10.setRadius(50);
        circle10.setStroke(Color.LAVENDER);
        circle10.setFill(Color.CORAL);
        p10.getChildren().add(circle10);
        Stage stage10 = new Stage();
        stage10.setScene(sc10);
        stage10.setTitle("Learning binding with Pane and Circle");
        stage10.show();
    }
}
