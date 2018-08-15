void setup(){
 size(800,800); 
}
int x=250;
int a=550;
int speed=3;

void draw(){
  background(255,255,255);
noFill();
for(int i=400;i>10;i-=5){
 ellipse(x,400,i,i);
 ellipse(a,400,i,i);
}
x+=speed;
a-=speed;
if(x>=600){
 speed*=-1; 
}
if(x<=200){
 speed*=-1; 
}
  }