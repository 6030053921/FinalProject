package LoanAndReturn;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class LoanPageRight extends StackPane{
	private ObservableList<Label> logDataList = FXCollections.observableArrayList();
	private ListView<Label> logListView;
	private int Number = 1;
	
	public LoanPageRight() {
		
		setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, 
			CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		setPrefWidth(400);
		logListView = new ListView<Label>(logDataList);
		logListView.setPrefWidth(250);
		logListView.setFocusTraversable(true);
		logListView.setBackground(new Background(new BackgroundFill(Color.IVORY, null, null)));
		logListView.setPlaceholder(new Label(""));
		
		getChildren().add(logListView);
	}
	
	public void addData(String name, String tel, String DVDName, double price) {
		Label newLabel = new Label(Number++ + " " + name + "#" + tel + " " + DVDName + " " + "price" + " bath");
		logDataList.add(newLabel);
		logListView.scrollTo(newLabel);
	}

}
