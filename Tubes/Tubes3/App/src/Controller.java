import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;

public class Controller {
  public Arc pacman;
  private double x, y;
  private double multiplier = 5;

  public void up(ActionEvent e){
    pacman.setCenterY(y -= 1 * multiplier);
  }
  public void right(ActionEvent e){
    pacman.setCenterX(x += 1 * multiplier);
  }
  public void left(ActionEvent e){
    pacman.setCenterX(x -= 1 * multiplier);
  }
  public void down(ActionEvent e){
    pacman.setCenterY(y += 1 * multiplier);
  }

}
