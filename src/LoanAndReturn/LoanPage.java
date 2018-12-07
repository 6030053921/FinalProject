package LoanAndReturn;
//import org.graalvm.compiler.asm.amd64.AMD64Assembler.AddressDisplacementAnnotation;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class LoanPage extends HBox{
	
	private ComboBox<String> DVDNameCombobox;
	private Label DVDNameLabel;
	private Label Customer;
	private TextField CustomerName;
	private Label Tel;
	private TextField CustomerTel;
	private Button Calculation;
	private ComboBox<String> Discount;
	private ComboBox<String> DayForLoan;
	private Button Back;
	private ComboBox<String> TheNumberToLoan;
	
	private static final int TextWidth = 200;
	
	public LoanPage() {
		setPadding(new Insets(15));
		setSpacing(20);
		setAlignment(Pos.CENTER);
		setPrefWidth(800);
		
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(15,15,15,15));
		vbox.setSpacing(20);
		vbox.setAlignment(Pos.CENTER);
		     //////////////////
		Customer = new Label("Customer's name");
		Customer.setStyle("-fx-font-size: 18");
		Customer.setTextFill(Color.BLUE);
		CustomerName = new TextField();
		CustomerName.setPromptText("Please Fill Customer's Name");
		CustomerName.setPrefWidth(TextWidth);
		     //////////////////
		Tel = new Label("Customer's tel");
		Tel.setStyle("-fx-font-size: 18");
		Tel.setTextFill(Color.BLUE);
		CustomerTel = new TextField();
		CustomerTel.setPromptText("Please Fill Customer's tel");
		CustomerTel.setPrefWidth(TextWidth);
		
		//hbox
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(15));
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		      
		//vbox1 left
		VBox vbox1 = new VBox();
		vbox1.setPadding(new Insets(15));
		vbox1.setAlignment(Pos.CENTER);
		vbox1.setSpacing(10);
		       ////////////////
		DVDNameLabel = new Label("DVD List");
		DVDNameLabel.setStyle("-fx-font-size: 18");
		DVDNameLabel.setTextFill(Color.BLUE);
		       ///////////////
		DVDNameCombobox = new ComboBox<>();
		DVDNameCombobox.getItems().addAll("Lord of the ring","Harry potter","Game of throne",
				"Divergent", "Twilight", "Hungergame", "Percy jackson");
		DVDNameCombobox.setPromptText("Please select DVD");
		DVDNameCombobox.setEditable(false);
		       ///////////////
		Discount = new ComboBox<>();
		Discount.getItems().addAll("Gold Card", "Silver Card", "Copper Card", "No card");
		Discount.setPromptText("Please select Card");
		Discount.setEditable(false);
		       ///////////////
		TheNumberToLoan = new ComboBox<>();
		TheNumberToLoan.getItems().addAll("1","2","3");
		TheNumberToLoan.setPromptText("Please select the Number you want to loan");
		TheNumberToLoan.setEditable(true);
		      ///////////////
		vbox1.getChildren().addAll(DVDNameLabel,DVDNameCombobox,Discount,TheNumberToLoan);
		
		//vbox2 right
		VBox vbox2 = new VBox();
		vbox2.setPadding(new Insets(15));
		vbox2.setSpacing(20);
		vbox2.setAlignment(Pos.CENTER);
		       ///////////////
		DayForLoan = new ComboBox<>();
		DayForLoan.getItems().addAll("3 days","7 days","14 day2","30 day");
		DayForLoan.setPromptText("Please select the day");
		DayForLoan.setEditable(false);
		      ///////////////
		Calculation = new Button("calulation");
	    Calculation.setPrefSize(120, 30);
	    Calculation.setStyle("-fx-background-color: rgba(500, 500, 500, 1);");
		      ///////////////
	    Back = new Button("back");
	    Back.setPrefSize(100, 30);
	    vbox2.getChildren().addAll(DayForLoan,Calculation,Back);
		
	    hbox.getChildren().addAll(vbox1,vbox2);
	    
	    vbox.getChildren().addAll(Customer,CustomerName,Tel,CustomerTel,hbox);
	    
	    LoanPageRight loanpageright = new LoanPageRight();
	    getChildren().addAll(vbox,loanpageright);
		
	}
	
	public String getCustomerName() {
		return CustomerName.getText().trim();
	}
	
	public String getCustomerTel() {
		return CustomerTel.getText().trim();
	}
	
	public String getDVDNameCombobox() {
		return DVDNameCombobox.getValue().toString();
	}
	
	public String getDiscount() {
		return Discount.getValue().toString().trim();
	}
	
	public String getDayForLoan() {
		return DayForLoan.getValue().toString();
	}
	
	public Button getBackBtn() {
		return Back;
	}
	
	public Button getCalculationBtn() {
		return Calculation;
	}
	
	public String getTheNumberToLoan() {
		return TheNumberToLoan.getValue().toString();
	}
	
	

}
