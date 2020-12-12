
void setup() {
  PImage face = loadImage("face.png");
  size(500, 600);
  face.resize(500, 600);
  image(face, 0, 0);
}
void draw() {
  fill(mouseY, mouseX, mouseX);
  ellipse(130, 190, 40, 40);
  ellipse(350, 180, 50, 50);
}
