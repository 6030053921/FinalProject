import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class PasswordTextField extends HBox{
	private PasswordField password = new PasswordField();
	private static final int labelwidth = 120;
	private static final int promptTextwidth = 200;
	
	public PasswordTextField(String title,String promptText) {
		setPadding(new Insets(1));
		setAlignment(Pos.CENTER);
		setSpacing(10);
		Label label = new Label(title);
		label.setStyle("-fx-font-size: 16");
		label.setPrefWidth(labelwidth);
		password.setPromptText(promptText);
		password.setPrefWidth(promptTextwidth);
//		setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, 
//				CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		
//		Color c = Color.web("#48D1CC");
		label.setTextFill(Color.WHEAT);
		
		setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
		setStyle(
                "-fx-background-color: linear-gradient(rgb(224,228,233) 0%, derive(rgb(224,228,233),-20%) 100%);" +
                "-fx-background-insets: " + 50 + ";"
        );


		getChildren().addAll(label,password);
		
	}
	
	public String getPassWordd() {
		return password.getText().trim();
	}


}
