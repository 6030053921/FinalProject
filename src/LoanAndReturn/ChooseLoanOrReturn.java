package LoanAndReturn;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ChooseLoanOrReturn extends VBox{
	private Button LoanBtn;
	private Button ReturnBtn;
	private Button BackBtn;
	
	public ChooseLoanOrReturn() {
		setAlignment(Pos.CENTER);
		setPadding(new Insets(15,15,15,15));
		setSpacing(30);
		setPrefWidth(300);
		
		HBox root = new HBox();
		setAlignment(Pos.CENTER);
		setPadding(new Insets(15,15,15,15));
		setSpacing(30);
		LoanBtn = new Button("LOAN");
		ReturnBtn = new Button("RETURN");
		root.getChildren().addAll(LoanBtn,ReturnBtn);
		
		BackBtn = new Button("Back");
		getChildren().addAll(root,BackBtn);
	}
	
	public Button getLoanBtn() {
		return LoanBtn;
	}
	public Button getReturnBtn() {
		return ReturnBtn;
	}
	public Button getBackBtn() {
		return BackBtn;
	}

}
