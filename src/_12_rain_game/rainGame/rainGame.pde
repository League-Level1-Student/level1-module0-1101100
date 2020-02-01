float bucketX = 0;
float bucketY = 0;
float raindropY = 0;
float raindropX = 0;
float raindropYVelocity = 0;
float gravity = 0.05;
int score = 0;
void setup(){
  
  size(1000 , 500);
  
}

void draw(){

   background(0, 125, 125);
     raindropYVelocity += gravity;
  raindropY += raindropYVelocity;
  drawRaindrop(raindropX, raindropY, 10);
  if (raindropY >= 500) {
    raindropX = random(50, 950);
    raindropY = 0;
    raindropYVelocity = 0;
  }
   drawBucket();
    if (sqrt(pow(bucketX - raindropX, 2) + pow(bucketY - raindropY, 2)) < 30) {
    raindropX = random(50, 950);
    raindropY = 0;
    raindropYVelocity = 0;
    score++;
    gravity = 0.05 + score * 0.01;
  }

  fill(0, 0, 0);
  textSize(10);
  text("Score: " + score, 10, 10);
} 
void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
}
void drawRaindrop(float x, float y, float size) {
    stroke(0, 0, 255);
    fill(0, 0, 255);
    for (float i = 2; i < size; i++ ) {
      ellipse(x,y + i*4,i*2,i*2);
    }
}
void drawBucket(){
   bucketX = mouseX;
  bucketY = mouseY;
  stroke(125, 125, 125);
  fill(125, 125, 125);
  rect(bucketX - 10, bucketY - 20, 40 , 61);
}
