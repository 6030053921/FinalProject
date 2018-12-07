package LoanAndReturn;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ReturnPage extends HBox{
	
	private Button Back;
	private Label DVDName;
	private ComboBox<String> DVDNameCombobox;
	private Label Number;
	private ComboBox<String> NumberCombobox;
	private Button confirm;
	
	public ReturnPage() {
		setAlignment(Pos.CENTER);
		setSpacing(10);
		setPadding(new Insets(15));
		setAlignment(Pos.CENTER);
		
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15));
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(15);
		
		VBox vbox1 = new VBox();
		vbox1.setAlignment(Pos.CENTER);
		vbox1.setPadding(new Insets(15));
		vbox1.setSpacing(20);
		DVDName = new Label("DVD List");
		DVDName.setStyle("-fx-font-size: 18");
		DVDName.setTextFill(Color.BLUE);
		DVDNameCombobox = new ComboBox<>();
		DVDNameCombobox.getItems().addAll("Lord of the ring","Harry potter","Game of throne",
				"Divergent", "Twilight", "Hungergame", "Percy jackson");
		DVDNameCombobox.setPromptText("Please select DVD");
		DVDNameCombobox.setEditable(false);
		confirm = new Button("confirm");
		confirm.setPrefSize(100, 30);
		vbox1.getChildren().addAll(DVDName,DVDNameCombobox,confirm);
		
		VBox vbox2 = new VBox();
		vbox2.setPadding(new Insets(15));
		vbox2.setSpacing(20);
		vbox2.setAlignment(Pos.CENTER);
		Number = new Label("Number");
		Number.setStyle("-fx-font-size: 18");
		Number.setTextFill(Color.BLACK);
		NumberCombobox = new ComboBox<>();
		NumberCombobox.getItems().addAll("1","2","3");
		NumberCombobox.setPromptText("Please select DVD");
		NumberCombobox.setEditable(true);
		Back = new Button("Back");
		Back.setPrefSize(100, 30);
		vbox2.getChildren().addAll(Number,NumberCombobox,Back);
		
		hbox.getChildren().addAll(vbox1,vbox2);
		
		ReturnPageRight returnpageright = new ReturnPageRight();
		
		getChildren().addAll(hbox, returnpageright);
				
	}
	
	public Button getBackBtn() {
		return Back;
	}
	
	public String getDVDNameCombobox() {
		return DVDNameCombobox.getValue().toString();
	}
	
	public String getNumberCombobox() {
		return NumberCombobox.getValue().toString();
	}
	
	public Button getConfirm() {
		return confirm;
	}
	

}
