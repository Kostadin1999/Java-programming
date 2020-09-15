package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group group = new Group();
        Scene scene = new Scene(group, 500, 500);

        double xOffset = scene.getWidth() / 2;
        double yOffset = scene.getHeight() / 2;

        for (int i = 0; i < 5 ; ++i)
        {
            Line line1 = new Line(xOffset + (40 * i), yOffset - (40 * i),
                    xOffset + (40 * i), yOffset + 40 + (40 * i));
            line1.setStroke(Color.RED);
            line1.setStrokeWidth(1);
            group.getChildren().add(line1);
        }

        for(int i = 0; i < 5; ++i) {
            Line line2 = new Line(xOffset + (40 * i), yOffset + 40 + (40 * i),
                    xOffset - 40 - (40 * i), yOffset + 40 + (40 * i));
            line2.setStroke(Color.RED);
            line2.setStrokeWidth(1);
            group.getChildren().add(line2);
        }

        for(int i = 0; i < 5; ++i) {
            Line line3 = new Line(xOffset - 40 - (40 * i), yOffset + 40 + (40 * i),
                    xOffset - 40 - (40 * i), yOffset - 40 - (40 * i));
            line3.setStroke(Color.RED);
            line3.setStrokeWidth(1);
            group.getChildren().add(line3);
        }

        for (int i = 0; i < 5; ++i) {
            Line line4 = new Line(xOffset - 40 - (40 * i), yOffset - 40 - (40 * i),
                    xOffset + 40 + (40 * i), yOffset - 40 - (40 * i));
            line4.setStroke(Color.RED);
            line4.setStrokeWidth(1);
            group.getChildren().add(line4);

        }
         primaryStage.setTitle("Shape");
         primaryStage.setScene(scene);
         primaryStage.show();
    }
}

