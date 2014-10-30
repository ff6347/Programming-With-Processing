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

public class ex0 extends PApplet {
  public void setup() {
// These are build in variables
// integer values
int w = width;
int h = height;
// now print to the console
// println adds a new line at the end of the text
print("The window is " + w + " pixels wide");
println(" and " + h + " pixels high");

// a string
String devider = "\n-------------------\n";
println(devider);
// now change them with a build in function
size(400, 225);

// flaoting point values
float ratio = ( (float)width / (float)height); // needs to be casted
String msg = "Oh now your're doing a fancy format with a " + ratio + " ratio?"; 
println(msg);
println(devider);


    noLoop();
  }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ex0" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
