// save images by keyPress
// you can either call keyPressed as boolean or use the
// void keyPressed method
// This sketch shows both

void setup() {
  // setup is executed once
  // nothing to see here move along
}

void draw() {
  // executed until the programm ends
  //
  // check if a ke is pressed
  if (keyPressed) {
    // set the backgroun to white
    background(255);
    // check if a key is pressed
    // If it is not S or s
    // save a white image
    if (key != 'S' || key != 's' ) {
      println("Neither S nor s pressed. Saving image white");
      saveFrame("image-white.png");
    }
  } else {
    // if no key is pressed set the background to black
    background(0);
  }
}

// press the mouse (or trackpad)
void mousePressed() {
  println("mouse pressed");
}

// executed when a key is pressed
// this is more acurate then looking for the keypressed boolean in the draw
// whatch the console output
// the keyPressed boolean in the draw can be executed several times
//
void keyPressed() {
  // if it is S or s
  // save a black image (becuase the bg is black)
  if (key == 'S' || key == 's') {
    println("S or s pressed. Saving image black");
    saveFrame("image-black.png");
    //    saveFrame("sequence-####.png");
  }
}

