import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Fx06 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent parent=(Parent)FXMLLoader.load(getClass().getResource("root4.xml"));
		Scene scene=new Scene(parent);//장면생성
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		//장면에 css적용
		
		stage.setTitle("외부 스타일 적용");//무대 윈도우 제목설정
		stage.setScene(scene);//무대에 장면올리기
		stage.show();//무대 윈도우 보기
	}	
	public static void main(String[] args) {
      launch(args);//start()메서드 호출
	}
}

