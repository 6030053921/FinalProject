import LoanAndReturn.ChooseLoanOrReturn;
import LoanAndReturn.LoanPage;
import LoanAndReturn.ReturnPage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class main extends Application {
    private ImageView image1;
    private ImageView image2;
	private static final Effect frostEffect = new BoxBlur(50, 50, 3);

	@Override
	public void start(Stage primaryStage) {
    	image1 = new ImageView(new Image(ClassLoader.getSystemResource("image/tree3.jpg").toString()));
    	image1.setEffect(frostEffect);
    	StackPane s1 = new StackPane(image1);
    	s1.setPadding(new Insets(15));
    	s1.setPrefWidth(500);
    	s1.setPrefHeight(600);
    	LoginPage loginpage = new LoginPage();
        s1.getChildren().addAll(loginpage);
        Scene loginpagescene = new Scene(s1);
        s1.setBackground(new Background(new BackgroundFill(Color.ORANGE, null, null)));
        
       
        StackPane s2 = new StackPane();
        s2.setPadding(new Insets(15,15,15,15));
        s2.setPrefHeight(600);
        s2.setPrefWidth(500);
        ChooseLoanOrReturn choose = new ChooseLoanOrReturn();
        s2.getChildren().addAll(choose);
        Scene choosescene = new Scene(s2);
        s2.setBackground(new Background(new BackgroundFill(Color.ORANGE, null, null)));
    	
        StackPane s3 = new StackPane();
        s3.setPadding(new Insets(5));
        s3.setPrefHeight(600);
        s3.setPrefWidth(900);
        LoanPage loanpage = new LoanPage();
        s3.getChildren().addAll(loanpage);
        Scene loanpagescene = new Scene(s3);
        s3.setBackground(new Background(new BackgroundFill(Color.ORANGE, null, null)));
        
        StackPane s4 = new StackPane();
        s4.setPadding(new Insets(5));
        s4.setPrefHeight(600);
        s4.setPrefWidth(900);
        ReturnPage returnpage = new ReturnPage();
        s4.getChildren().addAll(returnpage);
        Scene returnpagescene = new Scene(s4);
        s4.setBackground(new Background(new BackgroundFill(Color.ORANGE, null, null)));
        
        EventManager event = new EventManager();
        event.loginBtn(loginpage.getLoginButton(), primaryStage, choosescene);
        event.LoanBtn(choose.getLoanBtn(), primaryStage, loanpagescene);
        event.BackBtn(choose.getBackBtn(), primaryStage, loginpagescene);
        event.BackBtn(loanpage.getBackBtn(), primaryStage, choosescene);
        event.CalculateBtn(loanpage.getCalculationBtn());
        event.BackBtn(returnpage.getBackBtn(), primaryStage, choosescene);
        event.ReturnBtn(choose.getReturnBtn(), primaryStage, returnpagescene);
        
		primaryStage.setResizable(true);
		primaryStage.setTitle("ProgmethProject");
		primaryStage.setScene(loginpagescene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
