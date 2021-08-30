package fx01;

import java.awt.Label;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Labeled;
import javafx.stage.Stage;

public class MainClass01 extends Application{
	
	public static void main(String[ ] args) {
		launch(args);
	}
	@Override
	public void start(Stage arg0) throws Exception{
		Label lb = new Label("Hello !");
		lb.setFont( new Font(20));
		
		Scene scene = new Scene(lb, 200,100);
		
		arg0.setScene(scene);
		
		arg0.setTitle("연습중");
		arg0.show();
	}
}
