
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class LoginPage extends VBox{
	private Label ShopName;
//	private Label space;
	private ImageView ShopImage;
    private PasswordTextField Password;
    private UsernameTextField Username;
	private Button LoginButton;
//	private Button SigninButton;
	private Label CreateNewHere;
	
	public LoginPage() {
		setAlignment(Pos.CENTER);
		setPadding(new Insets(25,25,25,25));
		setPrefWidth(550);
		setSpacing(50);;
		
		HBox h = new HBox();
		h.setAlignment(Pos.CENTER);
	    ShopImage = new ImageView(new Image(ClassLoader.getSystemResource("image/dog_paw.jpg").toString()));
	    ShopImage.setPreserveRatio(true);
	    ShopImage.setFitWidth(40);
	    ShopImage.setFitHeight(40);
	    Rectangle clip = new Rectangle(
	       ShopImage.getFitWidth(), ShopImage.getFitHeight());
	    clip.setArcWidth(150);
	    clip.setArcHeight(150);
	    ShopImage.setClip(clip);
	    ShopName = new Label("Mr.Beans");
	    ShopName.setStyle("-fx-font-size: 30");
	    ShopName.setTextFill(Color.WHEAT);
	    h.getChildren().addAll(ShopImage);
	    h.getChildren().addAll(ShopName);
	    		
	    VBox UserAndPass = new VBox();
		UserAndPass.setAlignment(Pos.CENTER);
		UserAndPass.setSpacing(10);
		UserAndPass.setPadding(new Insets(20,20,20,20));
		UserAndPass.setOpacity(10);//0.7
		UserAndPass.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT,CornerRadii.EMPTY,Insets.EMPTY)));//ALICEBLUE
		//UserAndPass.setStyle("-fx-bacground-color:red");
		Password = new PasswordTextField("Password", "Your Password");
	    Username = new UsernameTextField("Username ", "Your username");
	    UserAndPass.getChildren().addAll(Username,Password);
	    
	    
	    
//	    HBox hbox = new HBox();
//        ShopImage = new ImageView(new Image(ClassLoader.getSystemResource("images/.jpg").toString()));
//		ShopImage.setPreserveRatio(true);
//		ShopImage.setFitWidth(40);
//		ShopImage.setFitHeight(40);
//		Rectangle clip = new Rectangle(
//          ShopImage.getFitWidth(), ShopImage.getFitHeight()
//        );
//        clip.setArcWidth(150);
//        clip.setArcHeight(150);
//        ShopImage.setClip(clip);
//	    ShopName = new Label("Mr.Beans");
//	    ShopName.setStyle("-fx-font-size: 30");
//	    ShopName.setTextFill(Color.WHEAT);
//	    hbox.getChildren().addAll(ShopImage);
//	    hbox.getChildren().addAll(ShopName);
	    
	    
	    VBox LF = new VBox();
	    LF.setAlignment(Pos.CENTER);
	    LF.setSpacing(10);
	    LF.setStyle("-fx-background-color: rgba(0, 0, 0, 0);");
	    LoginButton = new Button("Login");
	    LoginButton.setPrefSize(120, 30);
	    LoginButton.setStyle("-fx-background-color: rgba(500, 500, 500, 1);");
//	    SigninButton = new Button("Signin");
//	    SigninButton.setPrefSize(120, 30);
//	    SigninButton.setStyle("-fx-background-color: rgba(500, 500, 500, 1);");
//	    ForgetButton = new Button("forget password");
//	    ForgetButton.setPrefSize(120, 30);
//	    ForgetButton.setStyle("-fx-background-color: rgba(255, 255, 255, 1);");
	    LF.getChildren().addAll(LoginButton);
	    
	    VBox LSF = new VBox();
	    LSF.setAlignment(Pos.CENTER);
	    LSF.setSpacing(10);
	    LSF.setStyle("-fx-background-color: rgba(0, 0, 0, 0);");
	    Line line = new Line();
	    line.setStartX(70);
	    line.setStartY(150);
	    line.setEndX(340);
	    line.setEndY(150);
	    line.setStroke(Color.WHITE);
	    Group root = new Group(line);
	    HBox hbox1 = new HBox();
	    hbox1.setSpacing(25);
	    hbox1.setAlignment(Pos.CENTER);
	    Label e1 = new Label("Forget your password?");
	    e1.setFont(Font.font ("Verdana", 12));
	    e1.setTextFill(Color.WHITE);
	    CreateNewHere = new Label("Create new Here");
	    CreateNewHere.setFont(Font.font ("Verdana", 12));
	    CreateNewHere.setTextFill(Color.WHITE);
	    hbox1.getChildren().addAll(e1,CreateNewHere);
	    LSF.getChildren().addAll(root,hbox1);
	    
	    
	    
//	    setBorder(new Border(new BorderStroke(Color.BLACK, 
//	            BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
//	    setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
//	    
//        ShopImage = new ImageView(new Image(ClassLoader.getSystemResource("images/User.png").toString()));
//		
//		ShopImage.setPreserveRatio(true);
//		ShopImage.setFitWidth(150);
//		ShopImage.setFitHeight(150);
//		Rectangle clip = new Rectangle(
//            ShopImage.getFitWidth(), ShopImage.getFitHeight()
//        );
//        clip.setArcWidth(150);
//        clip.setArcHeight(150);
//        ShopImage.setClip(clip);
        
	    getChildren().addAll(h,UserAndPass,LF,LSF);
	}

	public Label getShopName() {
		return ShopName;
	}

	public ImageView getShopImage() {
		return ShopImage;
	}

	public PasswordTextField getPassword() {
		return Password;
	}

	public UsernameTextField getUsername() {
		return Username;
	}

	public Button getLoginButton() {
		return LoginButton;
	}

//	public Button getSigninButton() {
//		return SigninButton;
//	}
	
	public Label getCreateNewHere() {
		return CreateNewHere;
	}
	

}
