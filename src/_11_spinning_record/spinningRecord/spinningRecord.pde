import ddf.minim.*;
PImage pictureOfRecord;  
Minim minim;     
AudioPlayer song;
int angle=0;

void setup(){
    minim = new Minim(this);    //in the setup method
    song = minim.loadFile("awesomeTrack.mp3", 1000);   //in the setup method
    size(600,600);                                 
    pictureOfRecord= loadImage("record.png");   
    pictureOfRecord.resize(height,width);
}

void draw(){
  if (mousePressed) {
    song.play();
  }
  if (!mousePressed) {
    song.pause();
  }
    
    rotateImage(pictureOfRecord, angle);
  if (mousePressed) {
    angle=angle+2;
  }
    image(pictureOfRecord, 0, 0); 
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
}
