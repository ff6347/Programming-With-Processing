import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class ex1 extends PApplet {
  public void setup() {
// draw some simple shapes
// hint! The order in which you draw is important
// change x and y to move him around
int x = width/2;
int y = 25;
int w = 23; // make him bigger or smaller
int h = w; // distort by change the y seperatly
float bmi = 1; // body mass index
// a line takes 4 values the starting point and the end point
line(x - w, y + h, x +w, y+h);
// a ellipse always takes 4 values as parameter
ellipse(x, y, w, h);
// a point just two
point(x, y); // look he has a nose
// a rectangle also takes 4 values like the ellipse
// but draws from its upper left corner
rect(x-bmi/2, y + h, bmi, h);
// you can also draw free forms by using vertecies
noFill();
beginShape();
vertex(x - w, y + h*3);
vertex(x - w, y + h*2);
vertex(x + w, y + h*2);
vertex(x + w, y + h*3);
endShape();


    noLoop();
  }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ex1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
