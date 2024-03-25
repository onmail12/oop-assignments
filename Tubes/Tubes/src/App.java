
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    double size = 600;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, this.size, this.size, Color.BLACK);

        stage.setWidth(500);
        stage.setHeight(500);
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);

        Text text = new Text(50, 50, "Hello, World!");
        text.setFill(Color.WHITE);
        text.setFont(Font.font("Verdana", 24));

        Line line = new Line();
        line.setStroke(Color.RED);
        line.setStartX(0);
        line.setEndX(this.size);
        line.setStartY(100);
        line.setEndY(100);
        line.setStrokeWidth(50);
        line.setOpacity(.5);
        
        Rectangle rectangle = new Rectangle(100, 100);

        Image image = new Image("pizza.jpeg");
        ImageView imageView = new ImageView(image);

        imageView.setX(100);
        imageView.setY(100);
        
        root.getChildren().addAll(text, line, rectangle, imageView);
        stage.setTitle("STYLESHEET_CASPIAN");
        stage.setScene(scene);
        stage.show();
    }
}