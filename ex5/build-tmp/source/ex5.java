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

public class ex5 extends PApplet {

//use a loop to draw something
public void setup() {
  // excuted once
}
public void draw() {
  //executed all the time.
  //But we call no Loop at the end
  //
  //Loop the x coordinates
  for (int x = 0; x <= width; x+=5) {
    // loop the y coordinates
    //
    for(int y = 0; y <= height; y+=5){
      println("X: " + x + " || Y: " + y);
      ellipse(x,y,5,5);
    }
  }
  noLoop();
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ex5" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
