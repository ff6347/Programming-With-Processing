//use a loop to draw something
void setup() {
}

void draw() {
  for (int x = 0; x <= width; x+=5) {
    for(int y = 0; y <= height; y+=5){
      ellipse(x,y,5,5);
    }
  }
}

