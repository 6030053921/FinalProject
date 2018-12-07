import java.util.Arrays;

import LoanAndReturn.LoanPage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Inventory {
	
	public static String DVDName[] = {"Lord of the ring","Harry potter","Game of throne",
			"Divergent", "Twilight", "Hungergame", "Percy jackson"};
	public static double DVDPrice[] = {400,300,250,600,450,300,150};
	private double DVDStock[] = {12,12,12,12,12,12,12};
	private Double price;
	
	public Inventory() {
		
	}
	
	public void LoanDVD(String name, int stock, int day) {
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		int i = Arrays.binarySearch(this.DVDName, name);
		if(i < 0) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("Don't have " + name + " in stock");
			alert.showAndWait();
		}else {
			this.DVDStock[i] -= stock;
			LoanPage loanpage = new LoanPage();
			String card = loanpage.getDiscount();
			double discount = 1;
			if(card.equals("Gold card")) {
				discount = 0.9;
			}else if(card.equals("Silver card")) {
				discount = 0.8;
			}else if(card.equals("Copper card")) {
				discount = 0.7;
			}else {
				discount = 1;
			}
			price = (Double) (discount)*(this.DVDPrice[i] + day*5);
		}
		
	}
	
	public void ReturnDVD(String name, int stock) {
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		int i = Arrays.binarySearch(this.DVDName, name);
		if(i < 0) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setContentText("Don't have " + name + " in stock");
			alert.showAndWait();
		}else {
			this.DVDStock[i] += stock;
		}
	}
	
	public double getPrice() {
		return price;
	}

}
