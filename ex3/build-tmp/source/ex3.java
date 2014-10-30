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

public class ex3 extends PApplet {

// to have some interaction
// we need an loop to look for actions

public void setup() {
  size(400, 400);
  // executed once
  println("This is the setup. Executed once. Initiate things here");
}
// executed all the time waiting for infos
public void draw() {
  // do the bakcground color transformation
  noStroke();
  fill(map(mouseX, width, 0, 0, width), 100);
  rect(0, 0, width, height);
  // do the circle color transformation
  fill(mouseX);
  ellipse(mouseX, mouseY, 10, 10);

  println("Frame number: " + frameCount);
  print("mouse x: " + mouseX );
  println(" mouse y: " + mouseY );
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ex3" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
