import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.application.*;
import javafx.geometry.*;
import java.util.*;
import java.lang.Object;
import javafx.animation.*;
import javafx.beans.property.DoubleProperty;
import javafx.animation.Animation;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class BeanPane extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Scene scene = new Scene(new LinePane(),700,700);
		primaryStage.setTitle("BeanGame");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
class  LinePane extends Pane {
		final double radius = 9;
	double x = 350, y = 40;
	double dx = 1, dy = 1;
	Circle circle00 = new Circle(x, y, radius);
	Timeline animation;
	public LinePane(){
		circle00.setFill(Color.GREEN); // Set ball color
		// Create an animation for moving the ball
		animation = new Timeline(new KeyFrame(Duration.millis(8), e -> moveBall()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play(); // Start animation

		Polygon polygon = new Polygon();
		polygon.getPoints().addAll(new Double[]{320.0, 20.0   ,320.0, 100.0   ,150.0,520.0    ,150.0,600.0    ,600.0, 600.0   ,600.0,520.0    ,420.0,100.0   ,420.0,20.0});
		polygon.setStrokeWidth(6);
		polygon.setStroke(Color.GRAY);
		polygon.setFill(null);

		int[] linex ={200,250,300,350,400,450,500,550}; 
		int[] cirx = {370,345,395,320,370,420,295,345,395,445,270,320,370,420,470,245,295,345,395,445,495,220,270,320,370,420,470,520};
		int q=0;
		for (int k = 0; k < 7 ; k++){		//add middle circles
			for (int i = 0 ; i <= k ; i++){
				q= q + 1;
				int x = cirx[q-1];
				Circle circle = new Circle(x,70+65*k,10,Color.PURPLE);
				getChildren().add(circle);
			}
		}
		for (int i =0 ; i <=7;i++){			//add  line1,line2,line3,line4,line5,line6,line7,line8
			int x = linex[i];
			Line line = new Line(x,530,x,600);
			line.setStrokeWidth(5);
			line.setStroke(Color.BLACK);
			getChildren().add(line);
		}
		for (int i = 0 ; i < 8 ; i++){		//add circles at most lower
			Circle circle = new Circle(200 + 50*i,530,10,Color.RED);
			getChildren().add(circle);
		}
		getChildren().addAll(circle00,polygon);
}
    protected void moveBall(){
    int random;
    double d = 1;
    
    if(y >= 40 && y < 590){
		for (int i = 0 ; i <= 7 ;i++){
			if (y == 70 + 65*i ) {
					random = (int)(Math.random() * 2);
					if(random == 1){
					dx *= -d; 	
					}else{
					dx *= d; 
					}
				
			}
			if (x <= 310-27.5*i || x >= 420 + 27.5*i ){
				dx *= -1; }
		}
		for(int i = 0 ; i < 10 ; i++){
		if(x== 150 + 50*i){
			dx *= -1;
		}}
        x += dx;
		if(y == 585){
        dy *= 0;
		dx *= 0; 
		}
    }
    // Adjust ball position
    y += dy;
    circle00.setCenterX(x);
    circle00.setCenterY(y);
    }
}
