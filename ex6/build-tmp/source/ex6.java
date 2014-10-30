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

public class ex6 extends PApplet {
  public void setup() {
// se a very simple particle system
open("https://github.com/fabiantheblind/simple_particle_system");
    noLoop();
  }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ex6" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
