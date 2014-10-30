//use a loop to draw something
void setup() {
  // excuted once
}
void draw() {
  //executed all the time.
  //But we call no Loop at the end
  //
  //Loop the x coordinates
  for (int x = 0; x <= width; x+=5) {
    // loop the y coordinates
    //
    for(int y = 0; y <= height; y+=5){
      //watch the console
      println("X: " + x + " || Y: " + y);
      // draw smoething
      ellipse(x,y,5,5);
    }
  }

  // this stops the programm but does not exit (like the exit command)
  noLoop();
}

