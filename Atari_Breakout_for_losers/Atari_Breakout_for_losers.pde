int x=0;
int y=4;
int yspeed=2;
int speed=2;
void setup(){
  size(512,256);
  
  
  
  
  
  
  
  
  
  
  
  
}
void draw(){
   background(#FABDF3);
  fill(#000000);
  ellipse(x,y,8,8);
  stroke(#FA0D0D);
 fill (#FFFFFF);
 rect (mouseX, 250, 40, 6);
  x=x+speed;
  y=y+yspeed;
  if(y<=0){
yspeed=-yspeed  ;
  }
  if(x>=512){
   speed=-speed;
println(speed);}
if(intersects(x, y, mouseX, 250, 40)==true){
yspeed=-yspeed;
}
   
    
    
    
    
    
    
  if(x<=0){
    speed=-speed;
  }
}
  
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
return true;
else 
return false;



    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
  }


  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

