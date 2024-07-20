package tictactoe;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Paint;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AboutScr extends AnchorPane {

    protected final Label label;
    protected final Ellipse ellipse;
    protected final Label label0;
    protected final Ellipse ellipse0;
    protected final Ellipse ellipse1;
    protected final Ellipse ellipse2;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;

    public AboutScr(Stage stage) {

        label = new Label();
        ellipse = new Ellipse();
        label0 = new Label();
        ellipse0 = new Ellipse();
        ellipse1 = new Ellipse();
        ellipse2 = new Ellipse();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();

        setId("backG");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(570.0);
        setPrefWidth(750.0);

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setId("ticTacToe");
        label.setLayoutX(175.0);
        label.setLayoutY(26.0);
        label.setPrefHeight(103.0);
        label.setPrefWidth(400.0);
        label.setText("Created By");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#d72978"));
        label.setFont(new Font(70.0));

        ellipse.setFill(javafx.scene.paint.Color.valueOf("#ffc201"));
        ellipse.setLayoutX(217.0);
        ellipse.setLayoutY(242.0);
        ellipse.setRadiusX(146.0);
        ellipse.setRadiusY(72.0);
        ellipse.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setLayoutX(87.0);
        label0.setLayoutY(210.0);
        label0.setPrefHeight(64.0);
        label0.setPrefWidth(261.0);
        label0.setText("Ahmed Nasser");
        label0.setWrapText(true);
        label0.setTextFill(new LinearGradient(
            0, 0, 1, 0, true,  
            javafx.scene.paint.CycleMethod.NO_CYCLE,  
            new Stop(0, Color.rgb(17, 116, 203)),  
            new Stop(1, Color.rgb(215, 41, 120))
        ));
        label0.setFont(new Font("Vivaldi Italic", 38.0));

        ellipse0.setFill(javafx.scene.paint.Color.valueOf("#ffc201"));
        ellipse0.setLayoutX(551.0);
        ellipse0.setLayoutY(242.0);
        ellipse0.setRadiusX(146.0);
        ellipse0.setRadiusY(72.0);
        ellipse0.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        ellipse1.setFill(javafx.scene.paint.Color.valueOf("#ffc201"));
        ellipse1.setLayoutX(551.0);
        ellipse1.setLayoutY(433.0);
        ellipse1.setRadiusX(149.0);
        ellipse1.setRadiusY(72.0);
        ellipse1.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        ellipse2.setFill(javafx.scene.paint.Color.valueOf("#ffc201"));
        ellipse2.setLayoutX(218.0);
        ellipse2.setLayoutY(433.0);
        ellipse2.setRadiusX(149.0);
        ellipse2.setRadiusY(72.0);
        ellipse2.setStroke(javafx.scene.paint.Color.BLACK);
        ellipse2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        label1.setAlignment(javafx.geometry.Pos.CENTER);
        label1.setLayoutX(401.0);
        label1.setLayoutY(401.0);
        label1.setPrefHeight(64.0);
        label1.setPrefWidth(292.0);
        label1.setText("Mohammed Hassan");
        label1.setWrapText(true);
        label1.setTextFill(new LinearGradient(
            0, 0, 1, 0, true,  
            javafx.scene.paint.CycleMethod.NO_CYCLE,  
            new Stop(0, Color.rgb(17, 116, 203)),  
            new Stop(1, Color.rgb(215, 41, 120))
        ));
        label1.setFont(new Font("Vivaldi Italic", 38.0));

        label2.setAlignment(javafx.geometry.Pos.CENTER);
        label2.setLayoutX(87.0);
        label2.setLayoutY(401.0);
        label2.setPrefHeight(64.0);
        label2.setPrefWidth(261.0);
        label2.setText("Moneer Ahmed");
        label2.setWrapText(true);
        label2.setTextFill(new LinearGradient(
            0, 0, 1, 0, true,  
            javafx.scene.paint.CycleMethod.NO_CYCLE,  
            new Stop(0, Color.rgb(17, 116, 203)),  
            new Stop(1, Color.rgb(215, 41, 120))
        ));
        label2.setFont(new Font("Vivaldi Italic", 38.0));

        label3.setAlignment(javafx.geometry.Pos.CENTER);
        label3.setLayoutX(417.0);
        label3.setLayoutY(210.0);
        label3.setPrefHeight(64.0);
        label3.setPrefWidth(261.0);
        label3.setText("Mary marcos");
        label3.setWrapText(true);
        label3.setTextFill(new LinearGradient(
            0, 0, 1, 0, true,  
            javafx.scene.paint.CycleMethod.NO_CYCLE,  
            new Stop(0, Color.rgb(17, 116, 203)),  
            new Stop(1, Color.rgb(215, 41, 120))
        ));
        label3.setFont(new Font("Vivaldi Italic", 38.0));

        label4.setLayoutX(183.0);
        label4.setLayoutY(522.0);
        label4.setTextFill(Paint.valueOf("#fff"));
        label4.setText("Mobile Applications Development For Android 2024-R3 ITI Ismailia");

        getChildren().add(label);
        getChildren().add(ellipse);
        getChildren().add(label0);
        getChildren().add(ellipse0);
        getChildren().add(ellipse1);
        getChildren().add(ellipse2);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(label3);
        getChildren().add(label4);

    }

}
