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

public class ex4 extends PApplet {

// save images by keyPress

public void setup() {
  // setup is executed once
  ellipse(width/2, height/2, 50, 50);
}

public void draw() {
  if (keyPressed) {
    background(255);
    if (key != 'S' || key != 's' ) {
      println("Neither S nor s pressed. Saving image white");
      saveFrame("image-white.png");
    }
  } else {
    background(0);
  }
}

public void mousePressed() {

  println("mouse pressed");
}

public void keyPressed() {
  if (key == 'S' || key == 's') {
    println("S or s pressed. Saving image black");

    saveFrame("image-black.png");
    //    saveFrame("sequence-####.png");
  }
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ex4" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
