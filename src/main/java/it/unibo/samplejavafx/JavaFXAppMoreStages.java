package it.unibo.samplejavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFXAppMoreStages extends Application {

    @Override
    public final void start(final Stage primaryStage) throws Exception {
        final Button button = new Button("Create a new stage!");
        button.setFont(new Font(100));
        button.setOnMouseClicked(mouseEvent -> {
            new AnotherStage().show();
        });
        primaryStage.setScene(new Scene(button));
        primaryStage.setTitle("Hello");
        primaryStage.show();
    }

    public static void run(final String[] args) {
        launch();
    }

    public static final class Main {
        private Main() {
            // the constructor will never be called directly.
        }

        public static void main(final String... args) {
            JavaFXAppMoreStages.run(args);
        }
    }

    static class AnotherStage extends Stage {
        private static final int SCENE_WIDTH = 100;
        private static final int SCENE_HEIGHT = 500;

        AnotherStage() {
            super();
            setTitle("New stage created at " + System.currentTimeMillis());
            final VBox pane = new VBox();
            pane.getChildren().add(new Label("First label"));
            pane.getChildren().add(new Label("Second label"));
            setScene(new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT));
        }
    }
}
