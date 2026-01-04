package application;

import javafx.animation.RotateTransition;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class WeatherWidget extends BorderPane {

    public WeatherWidget() {

        // TOP: City name
        Label cityLabel = new Label("Addis Ababa");
        cityLabel.getStyleClass().add("city-label");
        setTop(cityLabel);
        BorderPane.setAlignment(cityLabel, Pos.CENTER);

        // CENTER: Weather data
        VBox centerBox = new VBox(10);
        centerBox.setAlignment(Pos.CENTER);

        Label tempLabel = new Label("22°C");
        tempLabel.getStyleClass().add("temp-label");

        Label conditionLabel = new Label("Clear Skies");
        conditionLabel.getStyleClass().add("condition-label");

        Label windLabel = new Label("Wind: 12 km/h NE");
        Label visibilityLabel = new Label("Visibility: 10 km");
        Label flightLabel = new Label("Flight Conditions: GOOD");

        // Compass Shape
        Circle compass = new Circle(30);
        compass.getStyleClass().add("compass");

        // Animation
        RotateTransition rotate = new RotateTransition(Duration.seconds(8), compass);
        rotate.setByAngle(360);
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.play();

        centerBox.getChildren().addAll(
                tempLabel, conditionLabel, compass,
                windLabel, visibilityLabel, flightLabel
        );
        setCenter(centerBox);

        // BOTTOM: Forecast
        HBox forecastBox = new HBox(20);
        forecastBox.setAlignment(Pos.CENTER);

        forecastBox.getChildren().addAll(
                new Label("Mon\n21°"),
                new Label("Tue\n23°"),
                new Label("Wed\n22°")
        );
        forecastBox.getStyleClass().add("forecast");

        setBottom(forecastBox);

        // Refresh controls
        TextField cityField = new TextField();
        cityField.setPromptText("Enter city");

        Button refreshBtn = new Button("Refresh");
        refreshBtn.disableProperty().bind(
                Bindings.isEmpty(cityField.textProperty())
        );

        VBox controls = new VBox(10, cityField, refreshBtn);
        controls.setAlignment(Pos.CENTER);
        setRight(controls);
    }
}
