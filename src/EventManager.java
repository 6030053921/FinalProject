import LoanAndReturn.LoanPage;
import LoanAndReturn.LoanPageRight;
import LoanAndReturn.ReturnPage;
import LoanAndReturn.ReturnPageRight;
import OfficialData.OfficialArrayList;
import OfficialData.Official_User;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EventManager {
	
	public EventManager() {
		
	}
	
	public void loginBtn(Button loginBtn,Stage stage, Scene scene) {
		int ii = 0;
		loginBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				LoginPage login = new LoginPage();
				OfficialArrayList L = new OfficialArrayList();
				boolean foundUsername = false;
				boolean foundPassword = false;
				for(int i=0 ; i < L.getOfficialList().size() ; i++ ) {
					if(login.getUsername().getUsernamee().equals(L.getOfficialList().get(i).getUsername())) {
						foundUsername = true;
						break;
					}
				}
				for(int i=0 ; i < L.getOfficialList().size() ; i++ ) {
					if(login.getPassword().getPassWordd().equals(L.getOfficialList().get(i).getPassword())) {
						foundPassword = true;
						break;
					}
				}
				
				if(foundUsername == true && foundPassword == false) {
//					loginBtn.setOnAction(e -> stage.setScene(scene));
					int ii = 0;
				}else {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setContentText("Incorrect username or password");
					alert.showAndWait();
				}
			}
		});
		if(ii == 0) {
			loginBtn.setOnAction(e -> stage.setScene(scene));
		}
		
		
	}
	
	public void LoanBtn(Button loanBtn, Stage stage, Scene scene) {
		loanBtn.setOnAction(e -> stage.setScene(scene));
	}
	
	public void ReturnBtn(Button returnBtn, Stage stage, Scene scene) {
		returnBtn.setOnAction(e -> stage.setScene(scene));
	}
	
	public void BackBtn(Button backBtn, Stage stage, Scene scene) {
		backBtn.setOnAction(e -> stage.setScene(scene));
	}
	
	public void CalculateBtn(Button calculateBtn) {
		calculateBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent args) {
				LoanPage loanpage = new LoanPage();
				LoanPageRight loanpageright = new LoanPageRight();
                Inventory inventory = new Inventory();
                inventory.LoanDVD(loanpage.getDVDNameCombobox(), Integer.parseInt(loanpage.getTheNumberToLoan()), Integer.parseInt(loanpage.getDayForLoan()));
				loanpageright.addData(loanpage.getCustomerName(), loanpage.getCustomerTel(), loanpage.getDVDNameCombobox(), inventory.getPrice());
			}
		});
	}
	
	public void ConfirmBtn(Button confirm) {
		confirm.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent args) {
				ReturnPage returnpage = new ReturnPage();
				ReturnPageRight returnpageright = new ReturnPageRight();
				Inventory inventory = new Inventory();
				inventory.ReturnDVD(returnpage.getDVDNameCombobox(), Integer.parseInt(returnpage.getNumberCombobox()));
				returnpageright.addData(returnpage.getDVDNameCombobox(), Integer.parseInt(returnpage.getNumberCombobox()));
				
			}
		});
	}


}
