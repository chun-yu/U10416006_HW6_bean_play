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
		final double radius = 11;
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
		polygon.getPoints().addAll(new Double[]{
			320.0, 30.0,
		    320.0, 100.0,
		    150.0, 520.0,
		    150.0, 600.0,
		    600.0, 600.0,
		    600.0, 520.0,
		    420.0, 100.0,
		    420.0, 30.0});
		polygon.setStrokeWidth(6);
		polygon.setStroke(Color.GRAY);
		polygon.setFill(null);
		Line line1 = new Line(200,530,200,600);
		Line line2 = new Line(250,530,250,600);
		Line line3 = new Line(300,530,300,600);
		Line line4 = new Line(350,530,350,600);
		Line line5 = new Line(400,530,400,600);
		Line line6 = new Line(450,530,450,600);
		Line line7 = new Line(500,530,500,600);
		Line line8 = new Line(550,530,550,600);

		Circle circle2 = new Circle(370,90,10,Color.PURPLE);
		Circle circle3 = new Circle(345,135,10,Color.PURPLE);
		Circle circle4 = new Circle(395,135,10,Color.PURPLE);
		Circle circle5 = new Circle(320,200,10,Color.PURPLE);
		Circle circle6 = new Circle(370,200,10,Color.PURPLE);
		Circle circle7 = new Circle(420,200,10,Color.PURPLE);
		Circle circle8 = new Circle(295,265,10,Color.PURPLE);
		Circle circle9 = new Circle(345,265,10,Color.PURPLE);
		Circle circle10 = new Circle(395,265,10,Color.PURPLE);
		Circle circle11 = new Circle(445,265,10,Color.PURPLE);
		Circle circle12 = new Circle(270,330,10,Color.PURPLE);
		Circle circle13 = new Circle(320,330,10,Color.PURPLE);
		Circle circle14 = new Circle(370,330,10,Color.PURPLE);
		Circle circle15 = new Circle(420,330,10,Color.PURPLE);
		Circle circle16 = new Circle(470,330,10,Color.PURPLE);
		Circle circle17 = new Circle(245,395,10,Color.PURPLE);
		Circle circle18 = new Circle(295,395,10,Color.PURPLE);
		Circle circle19 = new Circle(345,395,10,Color.PURPLE);
		Circle circle20 = new Circle(395,395,10,Color.PURPLE);
		Circle circle21 = new Circle(445,395,10,Color.PURPLE);
		Circle circle22 = new Circle(495,395,10,Color.PURPLE);
		Circle circle23 = new Circle(220,460,10,Color.PURPLE);
		Circle circle25 = new Circle(270,460,10,Color.PURPLE);
		Circle circle26 = new Circle(320,460,10,Color.PURPLE);
		Circle circle27 = new Circle(370,460,10,Color.PURPLE);
		Circle circle28 = new Circle(420,460,10,Color.PURPLE);
		Circle circle29 = new Circle(470,460,10,Color.PURPLE);
		Circle circle30 = new Circle(520,460,10,Color.PURPLE);
		Circle circle31 = new Circle(200,530,10,Color.RED);
		Circle circle32 = new Circle(250,530,10,Color.RED);
		Circle circle33 = new Circle(300,530,10,Color.RED);
		Circle circle34 = new Circle(350,530,10,Color.RED);
		Circle circle35 = new Circle(400,530,10,Color.RED);
		Circle circle36 = new Circle(450,530,10,Color.RED);
		Circle circle37 = new Circle(500,530,10,Color.RED);
		Circle circle38 = new Circle(550,530,10,Color.RED);

		
		line1.setStrokeWidth(5);
		line2.setStrokeWidth(5);
		line3.setStrokeWidth(5);
		line4.setStrokeWidth(5);
		line5.setStrokeWidth(5);
		line6.setStrokeWidth(5);
		line7.setStrokeWidth(5);
		line8.setStrokeWidth(5);
		
		line1.setStroke(Color.BLACK);
		getChildren().addAll(circle00,polygon,line1,line2,line3,line4,line5,line6,line7,line8,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9,circle10,circle11,circle12,circle13,circle14,circle15,circle16,circle17,circle18,circle19,circle20,circle21,circle22,circle23,circle25,circle26,circle27,circle28,circle29,circle30,circle31,circle32,circle33,circle34,circle35,circle36,circle37,circle38);
		
}
    protected void moveBall(){
    int random;
    double d = 0.6;
    
    if(y >= 40 && y < 590){
        if (y == 70) {
            random = (int)(Math.random() * 2);
            if(random == 1){
                dx *= -d; 	
            }else{
                dx *= d; 
            }
		 
        }
        if(y == 115){
            random = (int)(Math.random() * 2);            
            if(random == 1){
                if(dx == d||dx == -d){
                    dx *= -1; 	
                }
                else dx *= -d;
            }else{
                if(dx == d||dx == -d){
                    dx *= 1; 
                }
                else dx *= d;
            }
        }
        if(y == 180){
            random = (int)(Math.random() * 2);
            if(random == 1){
                dx *= -1; 	
            }else{
                dx *= 1; 
            }
        }
        if(y == 310){
            random = (int)(Math.random() * 2);
            if(random == 1){
                dx *= -1; 	
            }else{
                dx *= 1; 
            }
        }
        if(y == 375){
            random = (int)(Math.random() * 2);
            if(random == 1){
                dx *= -1; 	
            }else{
                dx *= 1; 
            }
        }
        if(y == 440){
            random = (int)(Math.random() * 2);
            if(random == 1){
                dx *= -1; 	
            }else{
                dx *= 1; 
            }
	}
        if(y == 510){
            random = (int)(Math.random() * 2);
            if(random == 1){
                dx *= -1; 	
            }else{
                dx *= 1; 
            }
	}
	        if(y == 530){
            dx *= -1;
			
	}
	        if(y == 550){
            dx *= -1;
	}
	
        x += dx;
    }
    if(y == 585){
        dy *= 0;
		dx *= 0; 
    }
    // Adjust ball position
    y += dy;
    circle00.setCenterX(x);
    circle00.setCenterY(y);
    }
}
