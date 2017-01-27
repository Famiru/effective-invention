package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	Stage okno;
	Scene menu, historia, gra;
	
	@Override
	public void start(Stage oknoGlowne) {
		
		okno = oknoGlowne;
		
		Label intro = new Label("Mroczny �wiat pe�ny z�a, czy dzi� przertwam?");
		Button przyciskWstep = new Button("Nowa gra");
		przyciskWstep.setOnAction(e -> okno.setScene(historia));
		Button przyciskGry = new Button("Nie poddam si�!");
		przyciskGry.setOnAction(e -> okno.setScene(gra));
		Button przyciskMenu = new Button("Powr�t");
		przyciskMenu.setOnAction(e -> okno.setScene(menu));
		Button przyciskPoziomu = new Button("LvL");
		przyciskPoziomu.setOnAction(e -> System.exit(0));
		Button przyciskWyjscia = new Button("Exit");
		przyciskWyjscia.setOnAction(e -> System.exit(0));
		
		//Menu
		VBox panelGlowny = new VBox();
		panelGlowny.getChildren().addAll(intro, przyciskWstep, przyciskGry, przyciskMenu);
		menu = new Scene(panelGlowny,1024,768);

		
		//Wygl�d Historii
		StackPane panelHistorii = new StackPane();
		panelHistorii.getChildren().add(przyciskGry);
		panelHistorii.getChildren().add(przyciskMenu);
		historia = new Scene(panelHistorii,1024,768);
		
		
		//Wyglad Gry
		StackPane panelGry = new StackPane();
		panelGry.getChildren().add(przyciskWyjscia);
		panelGry.getChildren().add(przyciskMenu);
		gra = new Scene(panelGry,1024,768);
		
		//Domyslne
		okno.getIcons().add(new Image("file:icon.jpg"));
		okno.setTitle("Alley of Death");
		okno.setResizable(false);
		okno.setScene(menu);
		okno.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
