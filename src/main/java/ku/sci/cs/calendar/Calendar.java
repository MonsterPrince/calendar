package ku.sci.cs.calendar;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Calendar extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Calendar.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("Calendar.css").toExternalForm());
			primaryStage.setTitle("Calendar Application");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
