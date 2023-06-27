package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button button = new Button("Click ME");
		Label label = new Label("Enter Your name: ");
		TextField nameField = new TextField();
		ToggleGroup group = new ToggleGroup();
		RadioButton button1 = new RadioButton("Selected first");
		button1.setToggleGroup(group);
		button1.setSelected(true);
		RadioButton button2 = new RadioButton("Selected second");
		button2.setToggleGroup(group);
		FlowPane pane = new FlowPane();
		pane.getChildren().addAll(button, label, nameField, button1, button2);
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("All the world's a stage");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}