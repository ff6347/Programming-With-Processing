// save images by keyPress

void setup() {
  ellipse(width/2, height/2, 50, 50);
}

void draw() {
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

void mousePressed() {

  println("mouse pressed");
}

void keyPressed() {
  if (key == 'S' || key == 's') {
    println("S or s pressed. Saving image black");

    saveFrame("image-black.png");
    //    saveFrame("sequence-####.png");
  }
}

