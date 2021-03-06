/*
 * Display text when game is over -- implemented from TextHUDInterface
 */
package asteroids.hud;

import asteroids.interfaceClass.TextHUDInterface;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author borbier
 */
public class GameOverText implements TextHUDInterface{
    // Initialize variables.
    private Text titleText;
    private Text finalScoreText;
    private VBox vb;
    private ScoreHUD score;
    
    // Constructor -- set the text up.
    public GameOverText(ScoreHUD score) {
        titleText = new Text();
        finalScoreText = new Text();
        vb = new VBox();
        this.score = score;
        
        vb.getChildren().addAll(titleText, finalScoreText);
        
        // Set-up.
        titleText.setFill(Color.WHITE);
        titleText.setFont(Font.font(null, FontWeight.BOLD, 32));
        titleText.setX(0);
        titleText.setY(0);
        titleText.setTranslateX(190);
        titleText.setTranslateY(240);
        
        finalScoreText.setFill(Color.WHITE);
        finalScoreText.setFont(Font.font(null, FontWeight.BOLD, 28));
        finalScoreText.setX(0);
        finalScoreText.setY(0);
        finalScoreText.setTranslateX(170);
        finalScoreText.setTranslateY(270);
    }
    
    // add the text to screen.
    @Override
    public void show(Pane screen) {
        screen.getChildren().add(vb);
    }
    
    // show the text.
    @Override
    public void display() {
        titleText.setText("GAME OVER.");
        finalScoreText.setText(score.getScore().getName()+"'s score : " + score.getValue());
    }
    
    // remove the text.
    @Override
    public void remove() {
        titleText.setText("");
        finalScoreText.setText("");
    }
}
