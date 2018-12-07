import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class UsernameTextField extends HBox{
	private TextField username;
	private final static int labelWidth = 120;
	private static final int promptTextWidth= 200;
	
	public UsernameTextField(String title,String promptText) {
		setPadding(new Insets(1));
		setAlignment(Pos.CENTER);
		setSpacing(10);
		Label label = new Label(title);
		label.setStyle("-fx-font-size: 16");
		label.setPrefWidth(labelWidth);
		username = new TextField();
		username.setPrefWidth(promptTextWidth);
		username.setPromptText(promptText);
		
		Color c = Color.web("#48D1CC");//
		label.setTextFill(Color.WHEAT);
		
		getChildren().addAll(label,username);
		
	}
	
	public String getUsernamee() {
		
		return username.getText().trim();
	}

}
