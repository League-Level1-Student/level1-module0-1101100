  int worms=0;
void setup(){
     size(500 , 500);
    background(0, 0, 0);
}

void draw(){

  makeMagical();
   float r = random(500);
   float r2 = random(500);
  for (int i = 0; i<=worms; i++){
    fill(255,0,0);
    ellipse(getWormX(i),getWormY(i),10 ,10);
  }
  if(mousePressed == true){
    worms++;
  }
}
void mouseClicked() {
worms++;
}
float frequency = 0.01;
    float noiseInterval = 1;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
